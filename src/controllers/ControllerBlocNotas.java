package controllers;
import models.ModelBlocNotas;
import views.ViewBlocNotas;

/**
 *
 * @author lupita
 */

import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;


public class ControllerBlocNotas {
    
    private FileWriter fw;
    private FileReader fr = null ;
    private JFileChooser jfc = new JFileChooser ();
    ModelBlocNotas model_BlocNotas;
    ViewBlocNotas view_BlocNotas;
    
    
    public ControllerBlocNotas(ModelBlocNotas modelBlocNotas,ViewBlocNotas view_BlocNotas){
        
        this.model_BlocNotas = model_BlocNotas;
        this.view_BlocNotas = view_BlocNotas;
        view_BlocNotas.jb_abrir.addActionListener(event -> jb_abrir_click());
        view_BlocNotas.jb_guardar.addActionListener(event -> jb_guardar_click());
        view_BlocNotas.jb_salir.addActionListener(event -> jb_salir_click());
        
    }
    
    public void jb_abrir_click(){
        try{
            jfc.showOpenDialog(view_BlocNotas);
            model_BlocNotas.setArchivo(jfc.getSelectedFile());
            fr = new FileReader(model_BlocNotas.getArchivo());
            int character = 0;
            String texto = "";
            while((character = fr.read())!=-1){
                texto+=(char) character;
            }
            fr.close();
            view_BlocNotas.jta_archivo.setText(texto);
            
        }
        catch(FileNotFoundException e){
            System.err.println("Error Archivo No encontrado");
        }
        catch(IOException e){
            System.err.println("Error con el Archivo");
            
        }
        finally{
        try{
            fr.close();
        }
        catch(IOException e){
            System.err.println("Error al cerrar");
        }  
        }
    }
    
    public void jb_guardar_click(){
        try{
       
        fw = new FileWriter(model_BlocNotas.getArchivo());
        System.out.println("archivo guardado Exitosamente"+model_BlocNotas.archivo.getName());
        fw.write(view_BlocNotas.jta_archivo.getText());
        fw.close();
        }
        catch(FileNotFoundException e){
            System.err.println("Error Archivo No encontrado");
        }
        catch(IOException e){
            System.err.println("Error con el Archivo");   
        }
    }
    
    public void jb_salir_click(){
        System.exit(0);
    }     
}

