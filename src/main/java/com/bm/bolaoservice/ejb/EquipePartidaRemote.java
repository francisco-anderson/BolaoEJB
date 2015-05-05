/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.ejb;

import com.bm.bolaoservice.entity.EquipePartida;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Anderson
 */
@Remote
public interface EquipePartidaRemote extends Serializable{
    
    public EquipePartida buscarPorId(Long idEquipe, Long idPartida);
    
    public List<EquipePartida> buscarPorEquipe(Long id);
    
    public List<EquipePartida> buscarPorPartida(Long id);
    
    public EquipePartida salvar(EquipePartida equipePartida);
    
}
