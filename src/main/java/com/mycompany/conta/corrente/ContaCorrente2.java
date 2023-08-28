package com.mycompany.conta.corrente;

public class ContaCorrente2 {
    // variáveis necessárias para a operação
    public double deposito, saque, saldo, taxado;

    // operação de saque e taxa
    public double operacao(){
        saldo = deposito - saque;
        taxado = saldo - saldo * 0.005;
        return taxado;
    }
    // valor do saldo após o saque (já taxado)
    public void valor(){
        operacao();
        System.out.println("Seu saldo após o saque é: "+ taxado);
    }
}
