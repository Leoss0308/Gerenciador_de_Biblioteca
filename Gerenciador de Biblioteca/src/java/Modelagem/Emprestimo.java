/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Renan
 */
public class Emprestimo {
    
    
    public Emprestimo (){
    }
    
    private int codEmprestimo = 0;
    private int qtdEmprestimo = 0;
    private Date dataRetirada;
    private Date dataDevolucao;
    private Time horaRetirada;
    private Time horaDevolucao; 

    public int getCodEmprestimo() {
        return codEmprestimo;
    }

    public void setCodEmprestimo(int codEmprestimo) {
        this.codEmprestimo = codEmprestimo;
    }

    public int getQtdEmprestimo() {
        return qtdEmprestimo;
    }

    public void setQtdEmprestimo(int qtdEmprestimo) {
        this.qtdEmprestimo = qtdEmprestimo;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Time getHoraRetirada() {
        return horaRetirada;
    }

    public void setHoraRetirada(Time horaRetirada) {
        this.horaRetirada = horaRetirada;
    }

    public Time getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(Time horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }
    
    public void confirmarEmprestimo(){
    
    }
    
    public void alterarEmprestimo(){
    
    }
    
    public void cancelarEmprestimo(){
    
    }
    
    public void solicitarRenovacao(){
    
    }
    
    public void confirmarDevolucao(){
    
    }
    
    public void verificarSituacaoEmprestimo(){
    
    }
    
    public void gerarComprovante(){
    
    }
}
    
