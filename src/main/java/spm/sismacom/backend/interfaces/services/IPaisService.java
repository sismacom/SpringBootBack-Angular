/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm.sismacom.backend.interfaces.services;

import java.util.List;
import spm.sismacom.backend.entidades.Pais;

/**
 *
 * @author SISMACOM
 */
public interface IPaisService {
    
    public List<Pais> findAll();

    public Pais findByID(Integer id);
    
    public Pais findByName(String nombre);

    //public Pais findByName(String nombrePais);
    public Pais save(Pais pais);

    public Pais update(Pais pais);

    public void delete(Integer id);
    
}
