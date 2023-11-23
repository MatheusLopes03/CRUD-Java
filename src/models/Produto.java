package models;

import java.util.Date;

public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double valor;
    private Date dataCadastro;

    public Produto(int id, String nome, int quantidade, double valor, String dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.dataCadastro = new Date();
    }

    // #region Getters and Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

     public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    // #endregion

}
