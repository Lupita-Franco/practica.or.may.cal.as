package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import models.ModelOperaciones;
import views.ViewOperaciones;
/**
 * 
 * @author Lupita
 */


public class ControllerOperaciones {
    
    public ViewOperaciones view_operaciones;
    public ModelOperaciones model_operaciones;
    
    public MouseListener mouselistener = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == view_operaciones.jb_suma) {
                model_operaciones.jb_suma();
            } else if (e.getSource() == view_operaciones.jb_resta) {
               model_operaciones.jb_resta();
            } else if (e.getSource() == view_operaciones.jb_multiplicacion) {
                model_operaciones.multiplicacion();
            } else if (e.getSource() == view_operaciones.jb_residuo) {
                model_operaciones.jb_residuo();
            } else {
                model_operaciones.divicion();
            }
        }

        
        @Override
        public void mousePressed(MouseEvent e) {
          if (e.getSource() == view_operaciones.jb_suma) {
                model_operaciones.jb_suma();
            } else if (e.getSource() == view_operaciones.jb_resta) {
              model_operaciones.jb_resta();
            } else if (e.getSource() == view_operaciones.jb_multiplicacion) {
                model_operaciones.multiplicacion();
            } else if (e.getSource() == view_operaciones.jb_residuo) {
               model_operaciones.jb_residuo();
            } else {
                model_operaciones.divicion();
            }  
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (e.getSource() == view_operaciones.jb_suma) {
                model_operaciones.jb_suma();
            } else if (e.getSource() == view_operaciones.jb_resta) {
                model_operaciones.jb_resta();
            } else if (e.getSource() == view_operaciones.jb_multiplicacion) {
                model_operaciones.multiplicacion();
            } else if (e.getSource() ==view_operaciones.jb_residuo) {
               model_operaciones.jb_residuo();
            } else {
                model_operaciones.divicion();
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getSource() == view_operaciones.jb_suma) {
                model_operaciones.jb_suma();
            } else if (e.getSource() == view_operaciones.jb_resta) {
                model_operaciones.jb_resta();
            } else if (e.getSource() == view_operaciones.jb_multiplicacion) {
                model_operaciones.multiplicacion();
            } else if (e.getSource() == view_operaciones.jb_residuo) {
                model_operaciones.jb_residuo();
            } else {
                model_operaciones.divicion();
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
           if (e.getSource() == view_operaciones.jb_suma) {
               model_operaciones.jb_suma();
            } else if (e.getSource() == view_operaciones.jb_resta) {
                model_operaciones.jb_resta();
            } else if (e.getSource() == view_operaciones.jb_multiplicacion) {
                model_operaciones.multiplicacion();
            } else if (e.getSource() == view_operaciones.jb_residuo) {
                model_operaciones.jb_residuo();
            } else {
                model_operaciones.divicion();
            }
        }

        
    };
       
    public ControllerOperaciones(ModelOperaciones modelOperaciones, ViewOperaciones viewOperaciones) {

        this.model_operaciones = modelOperaciones;
        this.view_operaciones = viewOperaciones;
       initView();
        
      
         this.view_operaciones.jb_suma.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                addButton(e);
            }
        });
       
       this.view_operaciones.jb_resta.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                jb_restaButton(e);
            }
        });
       
       this.view_operaciones.jb_residuo.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                jb_residuoButton(e);
            }
        });
       
       this.view_operaciones.jb_multiplicacion.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                multiplicateButton(e);
            }
        });
       
       this.view_operaciones.jb_divicion.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                divideButton(e);
            
   
            }
            
        });
       
    }

   
    
    
    public void addButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.view_operaciones.jtx_primeroValue.getText());
        double secondValue = Double.parseDouble(this.view_operaciones.jtx_segundoValue.getText());
        this.model_operaciones.setValues(firstValue, secondValue);
        this.view_operaciones.jtx_resultado.setText(""+this.model_operaciones.jb_suma());
    }
    
    public void jb_restaButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.view_operaciones.jtx_primeroValue.getText());
        double secondValue = Double.parseDouble(this.view_operaciones.jtx_segundoValue.getText());
        this.model_operaciones.setValues(firstValue, secondValue);
        this.view_operaciones.jtx_resultado.setText(""+this.model_operaciones.jb_resta());
    }
    
      public void jb_residuoButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.view_operaciones.jtx_primeroValue.getText());
        double secondValue = Double.parseDouble(this.view_operaciones.jtx_segundoValue.getText());
        this.model_operaciones.setValues(firstValue, secondValue);
        this.view_operaciones.jtx_resultado.setText(""+this.model_operaciones.jb_residuo());
    }
    
    public void multiplicateButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.view_operaciones.jtx_primeroValue.getText());
        double secondValue = Double.parseDouble(this.view_operaciones.jtx_segundoValue.getText());
        this.model_operaciones.setValues(firstValue, secondValue);
        this.view_operaciones.jtx_resultado.setText(""+this.model_operaciones.multiplicacion());
    }
    
    public void divideButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.view_operaciones.jtx_primeroValue.getText());
        double secondValue = Double.parseDouble(this.view_operaciones.jtx_segundoValue.getText());
        this.model_operaciones.setValues(firstValue, secondValue);
        this.view_operaciones.jtx_resultado.setText(""+this.model_operaciones.divicion());
    }
    
     public void initView(){
        this.view_operaciones.setTitle("Calculadora");     
        this.view_operaciones.setLocationRelativeTo(null);
        this.view_operaciones.setVisible(true);
    }

}



