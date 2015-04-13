/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.ejb;

import com.bm.bolaoservice.entity.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Anderson
 */
@Remote
public interface UsuarioRemote extends Serializable{
    
    public List<Usuario> consultarTodos();
    
    public Usuario consultarPorEmail(String email);
    
    public Usuario consultaPorId(Long id);
    
}
