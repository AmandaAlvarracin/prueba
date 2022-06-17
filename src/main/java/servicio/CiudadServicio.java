/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;


import java.util.ArrayList;
import java.util.List;
import modelo.Ciudad;

/**
 *
 * @author User
 */
public class CiudadServicio implements ICiudadServicio {
    private final List<Ciudad> ciudadList = new ArrayList<>();
    
    @Override
    public Ciudad crear(Ciudad ciudad) {
        this.ciudadList.add(ciudad);
        return ciudad;
    }

    @Override
    public List<Ciudad> listar() {
        return this.ciudadList;
    }
}