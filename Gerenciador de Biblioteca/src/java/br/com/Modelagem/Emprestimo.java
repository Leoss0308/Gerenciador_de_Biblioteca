/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelagem;

import java.util.Date;

/**
 *
 * @author Renan
 */
public class Emprestimo {

    public Emprestimo() {
    }

    private int codEmprestimo = 0;
    private String titulo;
    private int qtdLivro = 0;
    private Date dataRetirada;
    private Date dataDevolucao;
    private int codReserva = 0;
    private int codCliente = 0;
    private int matriculaFunc = 0;
    
    public int getCodEmprestimo() {
        return codEmprestimo;
    }

    public void setCodEmprestimo(int codEmprestimo) {
        this.codEmprestimo = codEmprestimo;
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

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the qtdLivro
     */
    public int getQtdLivro() {
        return qtdLivro;
    }

    /**
     * @param qtdLivro the qtdLivro to set
     */
    public void setQtdLivro(int qtdLivro) {
        this.qtdLivro = qtdLivro;
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
     * @return the codCliente
     */
    public int getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    /**
     * @return the matriculaFunc
     */
    public int getMatriculaFunc() {
        return matriculaFunc;
    }

    /**
     * @param matriculaFunc the matriculaFunc to set
     */
    public void setMatriculaFunc(int matriculaFunc) {
        this.matriculaFunc = matriculaFunc;
    }
}
