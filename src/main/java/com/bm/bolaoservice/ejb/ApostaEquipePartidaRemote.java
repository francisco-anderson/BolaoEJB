/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.ejb;

import com.bm.bolaoservice.entity.ApostaEquipePartida;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Anderson
 */
@Remote
public interface ApostaEquipePartidaRemote extends Serializable{
    
    public ApostaEquipePartida buscarPorId(Long idAposta,Long Equipe,Long Partida);
    
    public List<ApostaEquipePartida> buscarPorAposta(Long id);
    
    public List<ApostaEquipePartida> buscarPorEquipe(Long id);
    
    public List<ApostaEquipePartida> buscarPorPartida(Long id);
    
    public List<ApostaEquipePartida> buscarPorEquipePartida(Long idEquipe,Long idPartida);
    
    public ApostaEquipePartida salvar(ApostaEquipePartida apostaEquipePartida);
    
}
