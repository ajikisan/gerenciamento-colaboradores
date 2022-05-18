package com.company.models;

public class Endereco {
    //atributos - estão privados, pois serão modificados por getters and setters.

    private String rua;
    private String complemento;
    private String bairro;

    //criação de construtor alt + insert segurar a tecla shift e selecionar pressionando a tecla down (seta p/ baixo)

    public Endereco(String rua, String complemento, String bairro) {
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    // criação de um construtor vazio para que os demais itens de endereco() funcione
    // alt + insert - não realizar nenhuma seleção e clicar no botão None

    public Endereco() {
    }

    // métodos acessores para a visibilidade privada dos objetos alt + insert - getter and setter selecionar todos.


    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    //Para não puxar o endereço de memória
    //Vendedor{nome='Mirian', documento='13454646', valorSalario=2000.0, endereco=Endereco{}}
    // alt + insert  generate to string - seleciona tudo e pressiona ok.
    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}

