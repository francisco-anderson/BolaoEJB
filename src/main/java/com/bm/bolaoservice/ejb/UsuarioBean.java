/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.ejb;

import com.bm.bolaoservice.dao.UsuarioDAO;
import com.bm.bolaoservice.entity.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Anderson
 */
@Stateless
public class UsuarioBean implements UsuarioRemote {

    private static final long serialVersionUID = -466545973937668727L;

    @PersistenceContext(unitName = "persistencia")
    private EntityManager em;

    @Override
    public List<Usuario> consultarTodos() {
        UsuarioDAO dao = new UsuarioDAO(em);
        return dao.consultarTodosUsuarios();
    }

    @Override
    public Usuario consultarPorEmail(String email) {
        UsuarioDAO dao = new UsuarioDAO(em);
        return dao.consultarUsuarioEmail(email);
    }

    @Override
    public Usuario consultaPorId(Long id) {
        UsuarioDAO dao = new UsuarioDAO(em);
        return dao.find(id);
    }

}
