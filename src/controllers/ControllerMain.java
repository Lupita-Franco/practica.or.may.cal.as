package controllers;

import models.ModelMain;
import views.ViewMain;
import views.ViewMayor3Num;
import views.ViewOperaciones;
import views.ViewOrdenarAscyProm;
import views.ViewBlocNotas;


/**
 *
 * @author lupita
 */

public class ControllerMain{
    ModelMain model_main;
    ViewMain view_Main; 
    ViewMayor3Num view_mayor3num;
    ViewOperaciones view_Operaciones;   
    ViewOrdenarAscyProm view_ordenarascyprom;
     ViewBlocNotas view_blocnotas;
    private final ViewMain view_main;
    
    
    
    public ControllerMain(ModelMain model_main,Object views[]){
        this.model_main=model_main;
        this.view_mayor3num = (ViewMayor3Num) views[0];
        this.view_Operaciones = (ViewOperaciones) views[1];
        this.view_ordenarascyprom = (ViewOrdenarAscyProm) views[2];
        this.view_blocnotas = (ViewBlocNotas) views[3];
        this.view_main = (ViewMain) views[4];
        initView();
        view_main.jmi_mayor.addActionListener(e ->jmi_mayor_click());
        view_main.jmi_operaciones.addActionListener(e ->jmi_operaciones_click());
        view_main.jmi_ordenar.addActionListener(e-> jmi_ordenar_click());
        view_main.jmi_bloc.addActionListener(e ->jmi_bloc_click());
         view_main.jmi_salir.addActionListener(e ->jmi_salir_click());
       
        
       
    
    }

    public void initView(){
      
        this.view_main.setTitle("ARCHIVOS");
        this.view_main.setLocationRelativeTo(null);
        this.view_main.setVisible(true);
    }
    
    
    public void jmi_mayor_click() {
        this.view_main.setContentPane(view_mayor3num);
        this.view_main.revalidate();
        this.view_main.repaint();
    }
    public void jmi_operaciones_click(){
        this.view_main.setContentPane(view_Operaciones);
        this.view_main.revalidate();
        this.view_main.repaint();
    
    }
    public
         void jmi_ordenar_click() {
         this.view_main.setContentPane(view_ordenarascyprom);
        this.view_main.revalidate();
        this.view_main.repaint();
    }
    public void jmi_bloc_click() {
        this.view_main.setContentPane(view_blocnotas);
        this.view_main.revalidate();
        this.view_main.repaint();
    }
  
    public void jmi_salir_click() {
         System.exit(0);
    }   
    }
    
    
