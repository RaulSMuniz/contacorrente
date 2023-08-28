package com.mycompany.conta.corrente;

public class ContaCorrente2 {
    public double deposito, saque, saldo, taxado;
    public double operacao(){
        saldo = deposito - saque;
        taxado = saldo - saldo * 0.005;
        return taxado;
    }
    public void valor(){
        operacao();
        System.out.println("Seu saldo após o saque é: "+ taxado);
    }
}
