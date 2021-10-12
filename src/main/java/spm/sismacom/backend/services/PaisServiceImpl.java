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
import spm.sismacom.backend.entidades.Pais;
import spm.sismacom.backend.interfaces.IPaisDAO;
import spm.sismacom.backend.interfaces.services.IPaisService;

/**
 *
 * @author SISMACOM
 */
@Service
public class PaisServiceImpl implements IPaisService {

    @Autowired
    private IPaisDAO paisDao;

    @Override
    @Transactional(readOnly = true)
    public Pais findByID(Integer id) {
        return paisDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pais> findAll() {
        return (List<Pais>) paisDao.findAll();
    }

    @Override
    @Transactional
    public Pais save(Pais pais) {
        return (Pais) paisDao.save(pais);
    }

    @Override
    @Transactional
    public Pais update(Pais pais) {
        return (Pais) paisDao.save(pais);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        paisDao.deleteById(id);
    }

}
