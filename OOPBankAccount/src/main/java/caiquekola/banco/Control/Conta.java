package caiquekola.banco.Control;

import caiquekola.banco.Model.Banco;

public abstract class Conta {
    protected int agencia;
    protected int conta;
    protected Banco banco;
    protected double saldo;


    public Conta() {
        this.agencia = 0;
        this.conta = 0;
        this.banco = null;
        this.saldo = 0;
    }

    public Conta(int agencia, int conta, Banco banco, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.banco = banco;
        this.saldo = saldo;
    }

    public void depositar(double dinheiro) {
        this.saldo += dinheiro;
    }


    public void sacar(double dinheiro) {
        if(dinheiro<=saldo){
            this.saldo -= dinheiro;
        }
    }

    public void pix( Conta conta, double dinheiro) {

            if(dinheiro<=this.getSaldo()){
                this.saldo -= dinheiro;
                conta.saldo += dinheiro;
            }

    }
    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", banco=" + banco +
                ", Saldo=" + saldo +
                '}';
    }

    public int getAgencia() {
        return agencia;
    }


    public int getConta() {
        return conta;
    }


    public Banco getBanco() {
        return banco;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        saldo = saldo;
    }
}
