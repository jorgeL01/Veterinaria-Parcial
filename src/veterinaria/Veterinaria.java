/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author s114e13
 */
public class Veterinaria {
    protected String nombre;
    protected int edad;
    protected String sexo;
    protected String raza;
    protected int promedioVida;

    public Veterinaria(String nombre, int edad, String sexo, String raza, int promedioVida) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
        this.promedioVida = promedioVida;
    }

    public Veterinaria() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPromedioVida() {
        return promedioVida;
    }

    public void setPromedioVida(int promedioVida) {
        this.promedioVida = promedioVida;
    }

    
}
