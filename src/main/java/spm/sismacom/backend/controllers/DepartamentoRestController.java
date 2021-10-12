/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm.sismacom.backend.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import spm.sismacom.backend.entidades.Departamento;
import spm.sismacom.backend.interfaces.services.IDepartamentoService;
import spm.sismacom.backend.interfaces.services.IRegionService;

/**
 *
 * @author SISMACOM
 */
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/api")
public class DepartamentoRestController {
    
    @Autowired
    private IDepartamentoService deparService;
    
    @Autowired
    private IRegionService regionService;
    
    @GetMapping("/departamento/listartodos")
    public List<Departamento> getAllUsers() {
        return deparService.findAll();
    }

    @GetMapping("/departamento/buscarbyid/{id}")
    public Departamento show(@PathVariable Integer id) {
        return deparService.findByID(id);
    }

    @PostMapping("/departamento/nuevo/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Departamento create(@RequestBody Departamento departamento,@PathVariable Integer id) {
        departamento.setRegion(regionService.findByID(id));
        System.out.println("EL DEPARTAMENTO ES: " + departamento);
        return deparService.save(departamento);
    }

    @PutMapping("/departamento/actualizar/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Departamento update(@RequestBody Departamento departamento, @PathVariable Integer id) {
        //Departamento usactual=service.findByID(id);
        return deparService.save(departamento);
    }

    @DeleteMapping("/departamento/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Integer id) {
        deparService.delete(id);
    }
    
    
}
