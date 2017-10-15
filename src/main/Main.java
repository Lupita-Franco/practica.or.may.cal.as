package main;
import models.ModelMayor3Num;
import views.ViewMayor3Num;
import controllers.ControllerMayor3Nun;

import models.ModelOperaciones;
import views.ViewOperaciones;
import controllers.ControllerOperaciones;

import models.ModelOrdenarAscyProm;
import views.ViewOrdenarAscyProm;
import controllers.ControllerOrdenarAscyProm;

import models.ModelBlocNotas;
import views.ViewBlocNotas;
import controllers.ControllerBlocNotas;

import models.ModelMain;
import views.ViewMain;
import controllers.ControllerMain;


/**
 *
 * @author lupita
 */

public class Main {

    public static void main(String[] args) {
        
        ModelMayor3Num model_mayor3num = new ModelMayor3Num();
        ViewMayor3Num view_mayor3num = new ViewMayor3Num();
        ControllerMayor3Nun controller_mayor3num = new ControllerMayor3Nun(model_mayor3num,view_mayor3num);
       
        ModelOperaciones model_operaciones = new ModelOperaciones();
        ViewOperaciones view_operaciones = new ViewOperaciones();
       ControllerOperaciones controller_operaciones = new ControllerOperaciones(model_operaciones ,view_operaciones);
        
        ModelOrdenarAscyProm model_ordenarascyprom = new ModelOrdenarAscyProm();
        ViewOrdenarAscyProm view_ordenarascyprom = new ViewOrdenarAscyProm();
        ControllerOrdenarAscyProm controller_ordenarascyprom = new ControllerOrdenarAscyProm(model_ordenarascyprom,view_ordenarascyprom);
        
        ModelBlocNotas model_blocnotas = new ModelBlocNotas();
        ViewBlocNotas view_blocnotas = new ViewBlocNotas();
      ControllerBlocNotas controller_blocnotas= new ControllerBlocNotas(model_blocnotas,view_blocnotas);
        
        
        ModelMain model_main = new ModelMain();
        ViewMain view_main = new ViewMain();
        Object views[] =new Object [5];
        views[0] = view_mayor3num;
        views[1] = view_operaciones;
        views[2] = view_ordenarascyprom;
        views[3] = view_blocnotas;
        views[4] = view_main;
        
        ControllerMain controller_main = new ControllerMain(model_main,views);
    }
    
} 

