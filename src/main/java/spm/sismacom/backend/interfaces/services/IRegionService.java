/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm.sismacom.backend.interfaces.services;

import java.util.List;
import spm.sismacom.backend.entidades.Region;

/**
 *
 * @author SISMACOM
 */
public interface IRegionService {

    public List<Region> findAll();

    public Region findByID(Integer id);

    //public Region findByName(String nombreRegion);
    public Region save(Region region);

    public Region update(Region region);

    public void delete(Integer id);

}
