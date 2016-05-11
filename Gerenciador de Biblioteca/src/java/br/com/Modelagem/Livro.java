/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelagem;

import java.util.Date;

/**
 *
 * @author Fabiano Luiz
 */
public class Livro {

    public Livro() {
    }

    private int codLivro = 0;
    private String ISBN = "";
    private String edicaoLivro = "";
    private String tituloLivro = "";
    private String autorLivro = "";
    private String editoraLivro = "";
    private String resumoLivro = "";
    private String precoLivro = "";
    private Date anoPublicacao;
    private int quantidade = 0;
    private String categoriaLivro = "";
    private String tags = "";
    private Date dataEntrada;
    private String obsLivro = "";
    private int avaria = 0;
    private int emprestado = 0;
    private int matriculaFunc = 0;

    public void setMatriculaFunc(int matriculaFunc) {
        this.matriculaFunc = matriculaFunc;
    }

    public int getMatriculaFunc() {
        return matriculaFunc;
    }

    public void setAvaria(int avaria) {
        this.avaria = avaria;
    }

    public int getAvaria() {
        return avaria;
    }

    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEdicaoLivro() {
        return edicaoLivro;
    }

    public void setEdicaoLivro(String edicaoLivro) {
        this.edicaoLivro = edicaoLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public String getResumoLivro() {
        return resumoLivro;
    }

    public void setResumoLivro(String resumoLivro) {
        this.resumoLivro = resumoLivro;
    }

    public String getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(String precoLivro) {
        this.precoLivro = precoLivro;
    }

    public Date getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Date anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoriaLivro() {
        return categoriaLivro;
    }

    public void setCategoriaLivro(String categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getObsLivro() {
        return obsLivro;
    }

    public void setObsLivro(String obsLivro) {
        this.obsLivro = obsLivro;
    }

    /**
     * @return the emprestado
     */
    public int getEmprestado() {
        return emprestado;
    }

    /**
     * @param emprestado the emprestado to set
     */
    public void setEmprestado(int emprestado) {
        this.emprestado = emprestado;
    }

    //métodos
    public String cadastrarLivros() {
        return "";
    }

    public void consultarLivros() {
    }

    public String alterarLivros() {
        return "";
    }

    public String excluirLivros() {
        return "";
    }

}
