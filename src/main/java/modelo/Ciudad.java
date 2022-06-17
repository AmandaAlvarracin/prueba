/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Ciudad {
    

     private int codigoUbicacion;
     private String nombre;

    public Ciudad(int codigoUbicacion, String nombre) {
        this.codigoUbicacion = codigoUbicacion;
        this.nombre = nombre;
    }

    public int getCodigoUbicacion() {
        return codigoUbicacion;
    }

    public void setCodigoUbicacion(int codigoUbicacion) {
        this.codigoUbicacion = codigoUbicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Capitan{" + "codigoUbicacion=" + codigoUbicacion + ", nombre=" + nombre + '}';
    }
    
    
//}
}
