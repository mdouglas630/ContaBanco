import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final com os dados inseridos
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numero, saldo);


        scanner.close();
    }
}
