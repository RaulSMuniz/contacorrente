package com.mycompany.conta.corrente;

public class ContaCorrente {

    public static void main(String[] args) {
        ContaCorrente2 cal = new ContaCorrente2();
        cal.deposito = 500;
        cal.saque = 200;
        cal.valor();
    }
}
