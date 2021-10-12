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
import spm.sismacom.backend.entidades.Usuario;

import spm.sismacom.backend.interfaces.services.IUsuarioService;
import spm.sismacom.backend.interfaces.IUsuarioDAO;

/**
 *
 * @author SISMACOM
 */
@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioDAO dataRepo;
    
    /*@Autowired
    private JpaUtil jpaUtil=new JpaUtil();*/

    

    @Override
    @Transactional(readOnly = true)
    public Usuario findByID(Integer id) {
        return dataRepo.findById(id).orElse(null);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>) dataRepo.findAll();
    }

    

    @Override
    @Transactional
    public Usuario save(Usuario u) {
        return (Usuario) dataRepo.save(u);
    }

    @Override
    @Transactional
    public Usuario update(Usuario u) {
        return (Usuario) dataRepo.save(u);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        dataRepo.deleteById(id);
    }
/*
    @Override
    public Usuario findUser(String nombreUsuario) {
        return jpaUtil.findByName(nombreUsuario);
    }*/

    

}
