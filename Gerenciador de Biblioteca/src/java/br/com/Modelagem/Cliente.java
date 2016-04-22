/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelagem;

import java.util.Date;

/**
 *
 * @author Amanda
 */
public class Cliente extends Pessoa {

    //metodo construtor
    public Cliente() {

    }

    private int codClie = 0;
    private String cpfClie = "";
    private String statusClie = "";
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

    /**
     * @return the cpfClie
     */
    public String getCpfClie() {
        return cpfClie;
    }

    /**
     * @param cpfClie the cpfClie to set
     */
    public void setCpfClie(String cpfClie) {
        this.cpfClie = cpfClie;
    }

    /**
     * @return the statusClie
     */
    public String getStatusClie() {
        return statusClie;
    }

    /**
     * @param statusClie the statusClie to set
     */
    public void setStatusClie(String statusClie) {
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

    //Arrumar os tipos de metodos no diagrama classe
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
