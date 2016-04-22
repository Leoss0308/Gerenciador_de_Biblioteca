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
    
    public Itens_Emprestimo(){
    }
    
    private int codItemEmprestimo = 0;
    private int qtdItemEmprestimo = 0;

    public int getCodItemEmprestimo() {
        return codItemEmprestimo;
    }

    public void setCodItemEmprestimo(int codItemEmprestimo) {
        this.codItemEmprestimo = codItemEmprestimo;
    }

    public int getQtdItemEmprestimo() {
        return qtdItemEmprestimo;
    }

    public void setQtdItemEmprestimo(int qtdItemEmprestimo) {
        this.qtdItemEmprestimo = qtdItemEmprestimo;
    }
    
}
