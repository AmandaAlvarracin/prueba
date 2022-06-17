/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;



import java.util.List;
import modelo.Ciudad;

/**
 *
 * @author User
 */
public interface ICiudadServicio {
    public Ciudad crear(Ciudad ciudad);
    public List<Ciudad> listar();
}