package controllers;
import models.ModelOrdenarAscyProm;
import views.ViewOrdenarAscyProm;
import javax.swing.DefaultListModel;


/**
 *
 * @author lupita
 */

public final class ControllerOrdenarAscyProm {
    ModelOrdenarAscyProm model_ordenarascyprom;
    ViewOrdenarAscyProm view_ordenarascyprom;
    DefaultListModel<String> valores = new DefaultListModel<>();
    
    public ControllerOrdenarAscyProm(ModelOrdenarAscyProm model_ordenarascyprom,ViewOrdenarAscyProm view_ordenarascyprom){
        
        this.model_ordenarascyprom = model_ordenarascyprom;
        this.view_ordenarascyprom = view_ordenarascyprom;
       
        this.view_ordenarascyprom.jbtn_agregar.addActionListener(e -> jbtn_agregar_click());
        this.view_ordenarascyprom.jbtn_ascendente.addActionListener(e -> jbtn_ascendente_click());
        this.view_ordenarascyprom.jbtn_descender.addActionListener(e -> jbtn_desc_click());
        //this.view_ordenarascyprom.jbtn_promedio.addActionListener(e-> jbtn_promedio_click());
        this.view_ordenarascyprom.jlist_valores.setModel(valores);
        
        
    }
   
     public void jbtn_agregar_click(){
        valores.addElement(view_ordenarascyprom.jtf_valor.getText());
        view_ordenarascyprom.jtf_valor.setText("");
        view_ordenarascyprom.jtf_valor.setFocusable(true);
       
         
    }

    public void jbtn_ascendente_click(){
        model_ordenarascyprom.setValores(valores);
        model_ordenarascyprom.ascender();
        valores = model_ordenarascyprom.getValores();
    }
    
    public void jbtn_desc_click(){
       model_ordenarascyprom.setValores(valores);
        model_ordenarascyprom.descender();
        valores = model_ordenarascyprom.getValores();
    }
    
   public void jbtn_promedio_click(){
       int sumar = 0;
       int prom =0;
       int b=0;
       String i;
       
       
       sumar +=prom;
   }
       
   }

