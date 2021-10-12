/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm.sismacom.backend.Utils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Controller;

/**
 *
 * @author SISMACOM
 */
@Controller
public class JpaUtil {

    @PersistenceContext
    private EntityManager entityManager;

    public <T> T findByName(String name) {
        System.out.println("EL NOMBRE: " + name);
        T objeto = null;
        Query q = null;
        try {
            System.out.println("EN EL CREATE NATIVE QUERY");
            q = entityManager.createNativeQuery("select * from usuarios where nombre_usuario='" + name + "'");
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
        try {
            System.out.println("EN EL SINGLE RESULT");
            Object lk = q.getSingleResult();
            System.out.println("OBJETO: " + lk);
            objeto = (T) q.getSingleResult();
        } catch (RuntimeException ex) {
            System.out.println("MEnsaje: " + ex.getMessage());
            //ex.printStackTrace();
        }

        return objeto;
    }

}
