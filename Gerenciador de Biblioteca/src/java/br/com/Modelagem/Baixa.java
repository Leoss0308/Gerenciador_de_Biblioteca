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
    
    public Baixa(){
    }
    
    private int codBaixa = 0;
    private String motivoBaixa = "";
    private int qtdBaixa = 0;
    private String obsBaixa = "";

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

    public int getQtdBaixa() {
        return qtdBaixa;
    }

    public void setQtdBaixa(int qtdBaixa) {
        this.qtdBaixa = qtdBaixa;
    }
   
    public String getObsBaixa() {
        return obsBaixa;
    }

    public void setObsBaixa(String obsBaixa) {
        this.obsBaixa = obsBaixa;
    }

}
