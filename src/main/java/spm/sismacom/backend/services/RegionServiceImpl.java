/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm.sismacom.backend.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spm.sismacom.backend.entidades.Region;
import spm.sismacom.backend.interfaces.IRegionDAO;
import spm.sismacom.backend.interfaces.services.IRegionService;

/**
 *
 * @author SISMACOM
 */
@Service
public class RegionServiceImpl implements IRegionService {

    @Autowired
    private IRegionDAO regionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Region> findAll() {
        return (List<Region>) regionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Region findByID(Integer id) {
        return regionDao.findById(id).orElse(null);
    }

    @Override
    @Transactional()
    public Region save(Region region) {
        return regionDao.save(region);
    }

    @Override
    @Transactional()
    public Region update(Region region) {
        return regionDao.save(region);
    }

    @Override
    @Transactional()
    public void delete(Integer id) {
        regionDao.deleteById(id);
    }

}
