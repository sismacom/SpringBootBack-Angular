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
import spm.sismacom.backend.interfaces.services.IUsuarioService;
import spm.sismacom.backend.model.Usuario;
import spm.sismacom.backend.interfaces.IUsuarioRepository;

/**
 *
 * @author SISMACOM
 */
@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository dataRepo;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listar() {
        return (List<Usuario>) dataRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findByID(Integer id) {
        return dataRepo.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findUser(String nombre_usuario, String pass_usuario) {
        return dataRepo.findByUser(nombre_usuario, pass_usuario);
    }

    @Override
    @Transactional
    public Usuario save(Usuario u) {
        return (Usuario) dataRepo.save(u);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        dataRepo.deleteById(id);
    }

    @Override
    public Usuario edit(Usuario u) {
        return null;
    }

}
