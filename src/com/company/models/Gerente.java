package com.company.models;

/**
 * Sobscrever o método toString utilizando alt + insert - não funciona, está vazio, porque a classe FuncionárioPJ é privada.
 * Contrato com a classe de interface CalculaBonificacao
 */

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    //Atributo diferenciado
    private Double valorBonificacao;

    //Implementando o método
    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
    //Valor da Bonificação recebe o valor da remuneração multiplicado pelo percentual da bonificação + 100)
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;
    }

    //Para não trazer o endereço de memória com.company.models.Gerente@2669b199
    //Então depois de aplicar o método to string na classe de FuncionárioPJ recortar e colar aqui
    // "nome='" + nome + '\''  verifica-se que nome está destacado em vermelho devido a privacidade, portanto
    //trabalha-se com o super e get   "nome='" + super.getNome + '\'' +
    // this para demonstrar que vem desta classe.

    @Override
    public String toString() {
        return "Gerente {" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco().getComplemento() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }



}
