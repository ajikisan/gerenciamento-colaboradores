package com.company.models;

/**
 * Classe Filho
 * super - significa que este construtor vem da super classe FuncionarioCLT
 *
 */

public class OperadorDeCaixa extends FuncionarioCLT {

    //criação do construtor para receber os atributos
    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    //criação do construtor vazio
    public OperadorDeCaixa() {
    }

    //Sobescrevendo to string
    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }




}
