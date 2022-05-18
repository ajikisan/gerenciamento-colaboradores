package com.company.models;


/**
 * Esta classe Vendedor é filho da Classe FuncionarioCLT - ou seja contém todos os atributos do FuncionárioCLT
 * e que também assina contrato com a interface CalculaBonificacao.
 *
 * Class 'Vendedor' must either be declared abstract or implement abstract method 'calculaBonificacao(Double)
 * ' in 'CalculaBonificacao'
 *
 * E como o vendedor recebe bônus diferte descrever o algoritmo a ser calculado.
 *
 * Para apagar as importações do modelo quando houve a refatoração control + alt + O
 * import com.company.models.CalculaBonificacao;
 * import com.company.models.FuncionarioCLT;
 *
 */

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    //atributo diferenciado
    private Double valorDaBonificacao;

   //Método implementado a ser calculado
    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
    this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }

    //Sobescrevendo o método to string, ou seja, sobescrevendo os endereços de memória do FuncionarioCLT.
    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ", valorDaBonificacao=" + valorDaBonificacao +
                '}';
    }


}
