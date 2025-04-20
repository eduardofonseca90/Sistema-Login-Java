package ProjetoContaBancariaJava.Dominio;

public class VerSaldo {
    public double saldoContaBancaria;

    public void exibirSaldo() {
        saldoContaBancaria = 0;
        System.out.println("Disponível para saque: " + saldoContaBancaria);
    }
}
