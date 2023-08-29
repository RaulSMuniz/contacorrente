package com.mycompany.conta.corrente;
import java.util.Scanner;
public class ContaCorrente {

    public static void main(String[] args) {
        ContaCorrente2 cal = new ContaCorrente2();
        Scanner sd = new Scanner(System.in);
        System.out.println("Digite o valor que deseja depositar:");
        cal.deposito = (sd.nextInt());
        
        Scanner ss = new Scanner(System.in);
        System.out.println("Digite o valor que deseja sacar:");
        cal.saque = (ss.nextInt());
        cal.valor();
        sd.close();
        ss.close();
    }
}
