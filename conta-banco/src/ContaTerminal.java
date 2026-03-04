import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ola! Qual é seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.printf("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.printf("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextBigInteger().toString();

       System.out.printf("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é: " +agencia+ ", conta:  "+numero+ " e seu saldo: " +saldo+ " já está disponível para saque.");
    }
}
