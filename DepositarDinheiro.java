package ProjetoContaBancariaJava.Dominio;

import java.util.Scanner;

public class DepositarDinheiro {
    VerSaldo verSaldo;
    public double depositarValor;

    public DepositarDinheiro(VerSaldo verSaldo) {
        this.verSaldo = verSaldo;
    }

    public double depositarValor() {
        Scanner scanner = new Scanner(System.in);
        depositarValor = 0;
        System.out.println("Valor do depósito: ");
        depositarValor = scanner.nextDouble();
        verSaldo.saldoContaBancaria += depositarValor;

        System.out.print("Saldo: " + verSaldo.saldoContaBancaria);
        return 0;
    }
}
