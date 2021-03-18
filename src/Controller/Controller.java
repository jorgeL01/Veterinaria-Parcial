/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import veterinaria.Gatos;
import veterinaria.Perros;
import veterinaria.Tortugas;
import veterinaria.Veterinaria;

/**
 *
 * @author s114e13
 */
public class Controller {

    public ArrayList datos;

    public Controller() {
        datos = new ArrayList();
    }

    public void IngresarPerro(String nombre, int edad, String sexo, String raza) {
        Veterinaria animalPerro = new Perros(nombre,edad,sexo,raza);
        
        datos.add("Perro, nombre: "+animalPerro.getNombre()+", edad:"+animalPerro.getEdad()
        +" sexo:"+animalPerro.getSexo() +" raza: "+animalPerro.getRaza()+" promedio de vida: "+animalPerro.getPromedioVida() ) ;

    }
    
    public void IngresarGato(String nombre, int edad, String sexo, String raza){
        Veterinaria animalGato = new Gatos(nombre,edad,sexo,raza);
        
        datos.add("Gato, nombre"+animalGato.getNombre()+", edad:"+animalGato.getEdad()
        +" sexo:"+animalGato.getSexo() +" raza: "+animalGato.getRaza()+" promedio de vida: "+animalGato.getPromedioVida() );

    }
    
    public void IngresarTortuga(String nombre, int edad, String sexo){
        Veterinaria animalTortugas = new Tortugas(nombre,edad,sexo);
        
        datos.add("Tortuga, nombre"+animalTortugas.getNombre()+", edad:"+animalTortugas.getEdad()
        +" sexo:"+animalTortugas.getSexo() +" raza: "+animalTortugas.getRaza()+" promedio de vida: "+animalTortugas.getPromedioVida() );

    }
    
    public ArrayList Mostrar(){
        return datos;
    }
}
