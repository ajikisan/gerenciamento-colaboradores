package com.company;

/**
 * Houve importação de bibliotecas para trabalhar com os modelos/entidades/classes
 * Demonstra quais classes o método main consegue trabalhar.
 *
 */

import com.company.models.Endereco;
import com.company.models.Gerente;
import com.company.models.OperadorDeCaixa;
import com.company.models.Vendedor;

public class Main {

    public static void main(String[] args) {
        // Pede que o computador armazene um espaço da memória para guardar o endereço.
        // Endereco endereco = new Endereco();
        // Primeiro modo para receber e demostrar o endereço
        // endereco.setRua("Rua Brigadeiro Machado");
        // System.out.println(endereco.getRua());

        // Segundo modo para receber e demonstrar o endereço
        //   Selecinar o construtor com os atributos

        Endereco endereco = new Endereco("Rua do Funcionario", "Condomínio", "Bairro F");
        System.out.println("---------------");

        // Trabalhando com a classe Vendedor vazia e para isso utilizamos o setter
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Olaf");
        vendedor.setDocumento("13454646");
        vendedor.setValorSalario(2000d);
        vendedor.setEndereco(endereco);

        // Chama o método para valorDaBonificacao=null}
        vendedor.calculaBonificacao(2d);


        System.out.println(vendedor);
        System.out.println();

        //Trabalhando com a classe Operador de Caixa

    OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Shine", "12346", 1500d, endereco);
        System.out.println(operadorDeCaixa);
        System.out.println();

        // Quando a classe não tem construtor - modifica-se deste modo os atributos
        Gerente gerente = new Gerente();
        gerente.setNome("Mirian");
        gerente.setDocumento("78941");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        // valorRemuneracao=null, valorBonificacao=0.0}
        // Método para verificar o calculo da remuneracao
        // valorHora=100.0, valorRemuneracao=2000.0, valorBonificacao=0.0
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3.0); //ou 3d

        System.out.println(gerente);


    }
}
