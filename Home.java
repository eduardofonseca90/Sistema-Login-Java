package ProjetoContaBancariaJava.Dominio;

import java.util.Scanner;

public class Home {
    SacarDinheiro sacarDinheiro;
    DepositarDinheiro depositarDinheiro;
    VerSaldo verSaldo;

    public Home(VerSaldo verSaldo) {
        this.verSaldo = verSaldo;
        this.sacarDinheiro = new SacarDinheiro(verSaldo);
        this.depositarDinheiro = new DepositarDinheiro(verSaldo);
    }
    
    public void opcaoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("=====HOME=====");
        System.out.println("==============");
        System.out.println("1 - VER SALDO");
        System.out.println("2 - SAQUE");
        System.out.println("3 - DEPOSITO");
        System.out.println("4 - SAIR");

        int escolhaUsuarioHome = scanner.nextInt();
        
        if (escolhaUsuarioHome == 1) {
            verSaldo.exibirSaldo();
        } else if (escolhaUsuarioHome == 2) {
            sacarDinheiro.saque();
        } else if (escolhaUsuarioHome == 3) {
            depositarDinheiro.depositarValor();
        } else if (escolhaUsuarioHome == 4) {
            System.out.println("Aplicação encerrada");
        }
        scanner.close();
    }
}
