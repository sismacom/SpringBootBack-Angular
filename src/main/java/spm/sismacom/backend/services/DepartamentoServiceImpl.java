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
import spm.sismacom.backend.entidades.Departamento;
import spm.sismacom.backend.interfaces.IDepartamentoDAO;
import spm.sismacom.backend.interfaces.services.IDepartamentoService;

/**
 *
 * @author SISMACOM
 */
@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

    @Autowired
    private IDepartamentoDAO deparDao;

    @Override
    @Transactional(readOnly = true)
    public List<Departamento> findAll() {
        return (List<Departamento>) deparDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Departamento findByID(Integer id) {
        return deparDao.findById(id).orElse(null);
    }

    @Override
    @Transactional()
    public Departamento save(Departamento departamento) {
        return deparDao.save(departamento);
    }

    @Override
    @Transactional()
    public Departamento update(Departamento departamento) {
        return deparDao.save(departamento);
    }

    @Override
    @Transactional()
    public void delete(Integer id) {
        deparDao.deleteById(id);
    }

}
