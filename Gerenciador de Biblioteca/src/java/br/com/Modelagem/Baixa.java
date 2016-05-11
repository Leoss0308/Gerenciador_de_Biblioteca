/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelagem;

/**
 *
 * @author Fabiano Luiz
 */
public class Baixa {

    public Baixa() {
    }

    private int codBaixa = 0;
    private String motivoBaixa = "";
    private String obsBaixa = "";
    private int matriculaFunc = 0;
    private int codEmprestimo = 0;
    private int codLivro = 0;

    public int getCodBaixa() {
        return codBaixa;
    }

    public void setCodBaixa(int codBaixa) {
        this.codBaixa = codBaixa;
    }

    public String getMotivoBaixa() {
        return motivoBaixa;
    }

    public void setMotivoBaixa(String motivoBaixa) {
        this.motivoBaixa = motivoBaixa;
    }

    public String getObsBaixa() {
        return obsBaixa;
    }

    public void setObsBaixa(String obsBaixa) {
        this.obsBaixa = obsBaixa;
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

    /**
     * @return the codEmprestimo
     */
    public int getCodEmprestimo() {
        return codEmprestimo;
    }

    /**
     * @param codEmprestimo the codEmprestimo to set
     */
    public void setCodEmprestimo(int codEmprestimo) {
        this.codEmprestimo = codEmprestimo;
    }

    /**
     * @return the codLivro
     */
    public int getCodLivro() {
        return codLivro;
    }

    /**
     * @param codLivro the codLivro to set
     */
    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    //métodos
    public String registrarBaixa() {
        return "";
    }

    public void consultarBaixa() {
    }

    public String alterarBaixa() {
        return "";
    }

    public String excluirBaixa() {
        return "";
    }

}
