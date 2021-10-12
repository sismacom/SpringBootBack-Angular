/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm.sismacom.backend.interfaces.services;

import java.util.List;
import spm.sismacom.backend.entidades.Departamento;

/**
 *
 * @author SISMACOM
 */
public interface IDepartamentoService {

    public List<Departamento> findAll();

    public Departamento findByID(Integer id);

    //public Departamento findByName(String nombreDepartamento);
    public Departamento save(Departamento departamento);

    public Departamento update(Departamento departamento);

    public void delete(Integer id);

}
