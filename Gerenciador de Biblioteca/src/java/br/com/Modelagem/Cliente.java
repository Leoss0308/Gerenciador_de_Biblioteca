/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelagem;

import java.sql.Date;

/**
 *
 * @author Amanda
 */
public class Cliente extends Pessoa {

    //metodo construtor
    public Cliente() {

    }

    private int codClie = 0;
    private int cpfClie = 0;
    private int statusClie = 0;
    private String tipoCadastroClie = "";
    private Date dtCadastroClie;
    private String obsClie = "";

    //getters and setters
    /**
     * @return the codClie
     */
    public int getCodClie() {
        return codClie;
    }

    /**
     * @param codClie the codClie to set
     */
    public void setCodClie(int codClie) {
        this.codClie = codClie;
    }

    public int getCpfClie() {
        return cpfClie;
    }

    public void setCpfClie(int cpfClie) {
        this.cpfClie = cpfClie;
    }

    public int getStatusClie() {
        return statusClie;
    }

    public void setStatusClie(int statusClie) {
        this.statusClie = statusClie;
    }
    
    /**
     * @return the tipoCadastroClie
     */
    public String getTipoCadastroClie() {
        return tipoCadastroClie;
    }

    /**
     * @param tipoCadastroClie the tipoCadastroClie to set
     */
    public void setTipoCadastroClie(String tipoCadastroClie) {
        this.tipoCadastroClie = tipoCadastroClie;
    }

    /**
     * @return the dtCadastroClie
     */
    public Date getDtCadastroClie() {
        return dtCadastroClie;
    }

    /**
     * @param dtCadastroClie the dtCadastroClie to set
     */
    public void setDtCadastroClie(Date dtCadastroClie) {
        this.dtCadastroClie = dtCadastroClie;
    }

    /**
     * @return the obsClie
     */
    public String getObsClie() {
        return obsClie;
    }

    /**
     * @param obsClie the obsClie to set
     */
    public void setObsClie(String obsClie) {
        this.obsClie = obsClie;
    }
    //getters and setters

    
    //metodos
    public String cadastrarDadosClie() {
        return " ";
    }

    public String alterarDadosClie() {
        return " ";
    }

    public void consultarDadosClie() {
    }

    public boolean solicitarCancelamentoDaConta() {
        return true;
    }

    //metodos
}
