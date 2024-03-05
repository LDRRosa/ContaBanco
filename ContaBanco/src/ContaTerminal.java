import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o número da agendia");
        agencia = sc.nextLine();
        System.out.println("Digite o nome do cliente");
        nomeCliente = sc.nextLine();
        System.out.println("Digite o saldo do cliente");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        sc.close();
    }
}
