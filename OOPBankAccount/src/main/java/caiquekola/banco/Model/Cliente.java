package caiquekola.banco.Model;

import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public Cliente(String nome, String cpf, ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
        this.nome = nome;
        this.cpf = cpf;
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
    }


}
