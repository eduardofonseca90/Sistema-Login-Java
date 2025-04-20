package ProjetoContaBancariaJava.Dominio;

import java.util.Random;
import java.util.Scanner;

public class CriarConta {
    public String nomeCliente;
    public int numeroDaConta;
    public int senha;

    Scanner scanner = new Scanner(System.in);

    public void inserirNomeCliente() {
        System.out.println("Insira seu nome: ");
        nomeCliente = scanner.nextLine();
        String nomeMaiusculo = nomeCliente.toUpperCase();
        nomeCliente = nomeMaiusculo;
    }

    public void numeroDaConta() {
        Random random = new Random();
        numeroDaConta = 100000 + random.nextInt(900000);
        System.out.println("Número da sua conta: " + numeroDaConta);
    }

    public void criarSenha() {
        System.out.print("Escolha uma senha de 4 dígitos: ");
        senha = scanner.nextInt();
    }
}
