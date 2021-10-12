/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm.sismacom.backend.interfaces;

import org.springframework.data.repository.CrudRepository;
import spm.sismacom.backend.entidades.Usuario;

/**
 *
 * @author SISMACOM
 */

public interface IUsuarioDAO extends CrudRepository<Usuario, Integer> {

}
