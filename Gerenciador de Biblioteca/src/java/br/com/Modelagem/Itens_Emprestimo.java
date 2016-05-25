/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelagem;

/**
 *
 * @author Renan
 */
public class Itens_Emprestimo {

    public Itens_Emprestimo() {
    }
    
    private int codItemEmprestimo = 0;
    private int CodEmprestimo = 0;
    private int CodLivro = 0;    
    
    public int getCodItemEmprestimo() {
        return codItemEmprestimo;
    }

    public void setCodItemEmprestimo(int codItemEmprestimo) {
        this.codItemEmprestimo = codItemEmprestimo;
    }

    /**
     * @return the CodEmprestimo
     */
    public int getCodEmprestimo() {
        return CodEmprestimo;
    }

    /**
     * @param CodEmprestimo the CodEmprestimo to set
     */
    public void setCodEmprestimo(int CodEmprestimo) {
        this.CodEmprestimo = CodEmprestimo;
    }

    /**
     * @return the CodLivro
     */
    public int getCodLivro() {
        return CodLivro;
    }

    /**
     * @param CodLivro the CodLivro to set
     */
    public void setCodLivro(int CodLivro) {
        this.CodLivro = CodLivro;
    }

}
