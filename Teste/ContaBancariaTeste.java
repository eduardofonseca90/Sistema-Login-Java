package ProjetoContaBancariaJava.Teste;

import java.util.Scanner;

import ProjetoContaBancariaJava.Dominio.CriarConta;
import ProjetoContaBancariaJava.Dominio.DepositarDinheiro;
import ProjetoContaBancariaJava.Dominio.Home;
import ProjetoContaBancariaJava.Dominio.SacarDinheiro;
import ProjetoContaBancariaJava.Dominio.TelaLogin;
import ProjetoContaBancariaJava.Dominio.VerSaldo;

public class ContaBancariaTeste {
    public static void main(String[] args) {

        CriarConta criarConta = new CriarConta();
        TelaLogin telaLogin = new TelaLogin();
        VerSaldo verSaldo = new VerSaldo();
        SacarDinheiro sacarDinheiro = new SacarDinheiro(verSaldo);
        DepositarDinheiro depositarDinheiro = new DepositarDinheiro(verSaldo);
        Home home = new Home(verSaldo);

        Scanner scanner = new Scanner(System.in);

        int escolhaUsuario1 = 0;

        while (escolhaUsuario1 != 3) {

            System.out.println("=====MENU PRINCIPAL=====");
            System.out.println("[1] Login \n[2] Criar conta  \n[3] Sair");
            escolhaUsuario1 = scanner.nextInt();

            if (escolhaUsuario1 == 2) {
                criarConta.inserirNomeCliente();
                criarConta.numeroDaConta();
                criarConta.criarSenha();
            } else if (escolhaUsuario1 == 1) {
                if (criarConta.numeroDaConta == 0) {
                    System.out.println("Nenhuma conta criada. Por favor, crie uma conta.");
                } else {
                    int contaDigitada = telaLogin.inserirConta();
                    int senhaDigitada = telaLogin.inserirSenha();

                    if (contaDigitada != criarConta.numeroDaConta
                            || senhaDigitada != criarConta.senha) {
                        System.out.println("Número da conta ou senha inválidos");
                    } else {
                        System.out.println("BEM-VINDO " + criarConta.nomeCliente);
                        home.opcaoUsuario();
                    }
                }
            }
        }
        System.out.println("Aplicação encerrada");
        scanner.close();
    }
}
