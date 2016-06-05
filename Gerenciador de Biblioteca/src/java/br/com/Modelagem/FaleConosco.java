/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelagem;

import java.sql.Date;

/**
 *
 * @author i7
 */
public class FaleConosco {

    public FaleConosco() {
    }

    private int Cod_FaleConosco;
    private String nome;
    private String email;
    private String telefone;
    private String Assunto;
    private String mensagem;
    private Date dataEnvio;

    public int getCod_FaleConosco() {
        return Cod_FaleConosco;
    }

    public void setCod_FaleConosco(int Cod_FaleConosco) {
        this.Cod_FaleConosco = Cod_FaleConosco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAssunto() {
        return Assunto;
    }

    public void setAssunto(String Assunto) {
        this.Assunto = Assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

}
