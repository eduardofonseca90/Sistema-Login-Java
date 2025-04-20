package ProjetoContaBancariaJava.Dominio;

import java.util.Scanner;

public class TelaLogin {
    Scanner scanner = new Scanner(System.in);

    public int inserirConta() {
        System.out.print("Número da conta: ");
        return scanner.nextInt();
    }

    public int inserirSenha() {
        System.out.print("Senha: ");
        return scanner.nextInt();
    }
}
