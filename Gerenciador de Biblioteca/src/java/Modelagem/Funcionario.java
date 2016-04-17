/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import java.util.Date;

/**
 *
 * @author Amanda
 */
public class Funcionario extends Pessoa {

    //metodo construtor
    public Funcionario() {
    }

    private int matriculaFunc = 0;
    private String statusFunc = "";
    private boolean tipoFunc = true;
    private Date dtCadastroFunc;

    //getters and setters
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
     * @return the statusFunc
     */
    public String getStatusFunc() {
        return statusFunc;
    }

    /**
     * @param statusFunc the statusFunc to set
     */
    public void setStatusFunc(String statusFunc) {
        this.statusFunc = statusFunc;
    }

    /**
     * @return the tipoFunc
     */
    public boolean isTipoFunc() {
        return tipoFunc;
    }

    /**
     * @param tipoFunc the tipoFunc to set
     */
    public void setTipoFunc(boolean tipoFunc) {
        this.tipoFunc = tipoFunc;
    }

    /**
     * @return the dtCadastroFunc
     */
    public Date getDtCadastroFunc() {
        return dtCadastroFunc;
    }

    /**
     * @param dtCadastroFunc the dtCadastroFunc to set
     */
    public void setDtCadastroFunc(Date dtCadastroFunc) {
        this.dtCadastroFunc = dtCadastroFunc;
    }
    //getters and setters

    /*O bibliotecario pode visualizar seu cadastrado (se consultar).
    Arrumar no diagrama de classe e caso de uso 
    Arrumar os tipos de metodos*/
    //metodos
    public void consultarDadosFunc() {
    }

    //metodos

}
