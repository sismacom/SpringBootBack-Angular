/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm.sismacom.backend.interfaces.services;

import java.util.List;
import spm.sismacom.backend.entidades.Usuario;

/**
 *
 * @author SISMACOM
 */
public interface IUsuarioService {

    public List<Usuario> findAll();

    public Usuario findByID(Integer id);
    
    //public Usuario findUser(String nombreUsuario);

    public Usuario save(Usuario u);

    public Usuario update(Usuario u);

    public void delete(Integer id);

}
