/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controller.Controller;
import java.util.ArrayList;

/**
 *
 * @author s114e13
 */
public class Iniciar {
    public Controller ingresar;

    public Iniciar() {
        this.ingresar = new Controller();
    }
  
    public static void main(String[] args) {
        
        Iniciar principal = new Iniciar();
        principal.Llenar();
        principal.Mostrar();
        
    }
    
    public void Llenar(){
        ingresar.IngresarPerro("Thomas",2,"M","Pitbull");
        ingresar.IngresarGato("Tomy",3,"H","Pandora");
        ingresar.IngresarTortuga("Northon",5,"H");
    }
    
    public void Mostrar(){
        for (Object dato : ingresar.Mostrar()) {
            System.out.println(dato);
        }

    }
    
    
}
