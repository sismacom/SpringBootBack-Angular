/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm.sismacom.backend.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spm.sismacom.backend.model.Usuario;

/**
 *
 * @author SISMACOM
 */
@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {
    
    public Usuario findByUser(String nombre_usuario,String pass_usuario);


}
