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
    public Usuario consultaPorId(Long id) {
        UsuarioDAO dao = new UsuarioDAO(em);
        return dao.find(id);
    }

    @Override
    public Usuario consultarLogin(String email, String senha) {
        UsuarioDAO dao = new UsuarioDAO(em);
        return dao.consultarUsuarioLogin(email, senha);
    }

    @Override
    public Usuario novoUsuario(Usuario usuario) {
        UsuarioDAO dao = new UsuarioDAO(em);
        if (dao.consultarUsuarioEmail(usuario.getEmail()) != null) {
            return null;
        }
        return dao.save(usuario);
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        UsuarioDAO dao = new UsuarioDAO(em);
        return dao.save(usuario);
    }

}
