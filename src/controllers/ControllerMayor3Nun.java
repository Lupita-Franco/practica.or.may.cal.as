
package controllers;
import views.ViewMayor3Num;
import models.ModelMayor3Num;

/**
 *
 * @author lupita
 */
public class ControllerMayor3Nun {
ModelMayor3Num model_mayor3num;
ViewMayor3Num view_mayor3num;

public ControllerMayor3Nun (ModelMayor3Num model_mayor3num, ViewMayor3Num view_mayor3num){
    this.model_mayor3num = model_mayor3num;
    this.view_mayor3num =view_mayor3num;
    view_mayor3num.jbtn_mayor.addActionListener(e -> jbtn_mayor_click());
    initview();

}
public void initview(){
    view_mayor3num.jtf_n1.setText(String.valueOf(model_mayor3num.getN1()));
    view_mayor3num.jtf_n2.setText(String.valueOf(model_mayor3num.getN2()));
    view_mayor3num.jtf_n3.setText(String.valueOf(model_mayor3num.getN3()));
    view_mayor3num.jtf_n3.setText(String.valueOf(model_mayor3num.getM()));
     view_mayor3num.jbtn_mayor.addActionListener(e -> jbtn_mayor_click());
    view_mayor3num.setVisible(true);
    

}
public void jbtn_mayor_click(){
 model_mayor3num.setN1(Integer.parseInt(view_mayor3num.jtf_n1.getText()));
 model_mayor3num.setN2(Integer.parseInt(view_mayor3num.jtf_n2.getText()));
 model_mayor3num.setN3(Integer.parseInt(view_mayor3num.jtf_n3.getText()));
 model_mayor3num.mayor();
 view_mayor3num.jtf_m.setText(String.valueOf(model_mayor3num .getM()));
   



   }
    
}
