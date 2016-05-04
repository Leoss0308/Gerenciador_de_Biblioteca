/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelagem;

import java.sql.Time;
import java.text.SimpleDateFormat;
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
    private Time horaReserva;

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
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
        this.dataReseva = new Date();
    }

    /**
     * @return the horaReserva
     */
    public Time getHoraReserva() {
        return horaReserva;
    }

    /**
     * @param horaReserva the horaReserva to set
     */
    public void setHoraReserva(Time horaReserva) {
        this.horaReserva = horaReserva;
    }
    
    public boolean solicitarReserva() {
        return true;
    }
    
    public boolean confirmarReserva() {
        return true;
    }
    
    public String alterarReserva() {
        return "";
    }
    
    public boolean cancelarReserva() {
        return true;
    }
    
    public void verificarSituacaoReserva(){
        
    }
    
    public void gerarComprovante() {
        
    }
    
}
