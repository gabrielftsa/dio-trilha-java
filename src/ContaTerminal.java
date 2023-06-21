import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero;
        String Agencia = "067-8";
        String nomeCliente;
        double saldo = 0d;

        System.out.println("Bem-vindo(a) à Agência nº 067-8\n ");
        System.out.println("Por favor, insira seu novo número identificador da Agência !");
        numero = leitor.nextInt();

        System.out.println("Por favor, insira seu nome completo !");
        nomeCliente = leitor.next();

        System.out.println("Por favor, insira seu saldo.");
        saldo = leitor.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + Agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
