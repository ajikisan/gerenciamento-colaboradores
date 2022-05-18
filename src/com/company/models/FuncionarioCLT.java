package com.company.models;

/**
 * Esta classe vai ser somente de herança, por este motivo colocou-se a palavra abstract - a partir desta classe teremos
 * a classe vendedor e operador de caixa.
 * visibilidade protegido
 * Composição é pegar uma classe e colocar em outra classe como atributo. No caso estamos falando da classe Endereco que
 * agora é um atributo da classe FuncionárioCLT.
 * Não posso pedir para o  meu sistema salvar um funcinário CLT, pois vai dar erro.
 *
 */
public abstract class FuncionarioCLT {
    // atributos
    protected String nome;
    protected String documento;
    protected Double valorSalario;
    protected Endereco endereco; // Isto é uma composição - Não preciso pegar rua, complemento e bairro.

    // criação do construtor vazio.
    public FuncionarioCLT() {
    }

    // criação do construtor com todos os atributos
    public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.valorSalario = valorSalario;
        this.endereco = endereco;
    }

    // criação do método getter and setter - para fazer as modificações

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
