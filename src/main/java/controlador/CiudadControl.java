/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


    
import java.util.List;
import modelo.Ciudad;
import servicio.CiudadServicio;

/**
 *
 * @author User
 */
public class CiudadControl {

    private final CiudadServicio ciudadServicio = new CiudadServicio();
    
    public Ciudad crear(String [] params){
        var ciudad = new Ciudad(Integer.valueOf(params[0]),params[1]);
        this.ciudadServicio.crear(ciudad);
        return ciudad;
    }
    
    public List<Ciudad> listar()
    {
        return this.ciudadServicio.listar();
    }
   }