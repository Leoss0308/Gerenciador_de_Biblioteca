/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelagem;

import java.util.Date;

/**
 *
 * @author Erico
 */
public class Reserva {

    public Reserva() {
    }
    
    private int codReserva = 0;
    private Date dataReseva;
    private int codClie = 0;

    public int getCodClie() {
        return codClie;
    }

    public void setCodClie(int codClie) {
        this.codClie = codClie;
    }

    /**
     * @return the codReserva
     */
    public int getCodReserva() {
        return codReserva;
    }

    /**
     * @param codReserva the codReserva to set
     */
    public void setCodReserva(int codReserva) {
        this.codReserva = codReserva;
    }

    /**
     * @return the dataReseva
     */
    public Date getDataReseva() {
        return dataReseva;
    }

    /**
     * @param dataReseva the dataReseva to set
     */
    public void setDataReseva(Date dataReseva) {
        this.dataReseva = dataReseva;
    }
  
    public boolean inserirReserva() {
        return true;
    }
    
    public boolean confirmarReserva() {
        return true;
    }
        
    public boolean cancelarReserva() {
        return true;
    }
    
    public void verificarSituacaoReserva(){
        
    }
    
    public void gerarComprovante() {
        
    }
    
}
