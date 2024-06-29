package caiquekola.banco.Model;

import caiquekola.banco.Control.Conta;

public class ContaCorrente extends Conta  {
    private static int SEQUENCIAL = 1;

    public ContaCorrente(){
        super.agencia = 1;
        super.conta = SEQUENCIAL++;
    }
}
