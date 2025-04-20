package ProjetoContaBancariaJava.Dominio;

import java.util.Scanner;

public class SacarDinheiro {
    VerSaldo verSaldo;

    public SacarDinheiro(VerSaldo verSaldo) {
        this.verSaldo = verSaldo;
    }

    public double saque() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor do saque: ");
        double valorDoSaque = scanner.nextDouble();

        if (valorDoSaque > verSaldo.saldoContaBancaria) {
            System.out.println("Valor indiposível");
        } else {
            verSaldo.saldoContaBancaria -= valorDoSaque;
            System.out.println("Saque realizado com sucesso");
        }
        return 0;
    }
}
