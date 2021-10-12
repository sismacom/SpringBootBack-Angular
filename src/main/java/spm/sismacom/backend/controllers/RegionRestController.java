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
import spm.sismacom.backend.entidades.Pais;
import spm.sismacom.backend.entidades.Region;
import spm.sismacom.backend.interfaces.services.IPaisService;
import spm.sismacom.backend.interfaces.services.IRegionService;

/**
 *
 * @author SISMACOM
 */
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/api")
public class RegionRestController {

    @Autowired
    private IRegionService regionService;

    @Autowired
    private IPaisService paisServ;

    @GetMapping("/region/listartodos")
    public List<Region> getAllUsers() {
        return regionService.findAll();
    }

    @GetMapping("/region/buscarbyid/{id}")
    public Region show(@PathVariable Integer id) {
        return regionService.findByID(id);
    }

    @PostMapping("/region/nuevo/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Region create(@RequestBody Region region, @PathVariable Integer id) {
        Pais p = paisServ.findByID(id);
        region.setPais(p);
        return regionService.save(region);
    }

    @PutMapping("/region/actualizar/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Region update(@RequestBody Region region, @PathVariable Integer id) {
        //Region usactual=service.findByID(id);
        return regionService.save(region);
    }

    @DeleteMapping("/region/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Integer id) {
        regionService.delete(id);
    }

}
