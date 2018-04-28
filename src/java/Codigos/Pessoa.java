/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author ice
 */
public class Pessoa {
   private String nome;
   private String telefone;
   private Integer disponibilidade=0;
   private Integer demanda=0;
   private Boolean intercambista;

    public Pessoa(String nome, String telefone, Integer disponibilidade, Integer demanda, Boolean intercambista) {
        this.nome = nome;
        this.telefone = telefone;
        this.disponibilidade = disponibilidade;
        this.demanda = demanda;
        this.intercambista = intercambista;
    }

        
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Integer disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Integer getDemanda() {
        return demanda;
    }

    public void setDemanda(Integer demanda) {
        this.demanda = demanda;
    }

    public Boolean getIntercambista() {
        return intercambista;
    }

    public void setIntercambista(Boolean intercambista) {
        this.intercambista = intercambista;
    }
    
}
