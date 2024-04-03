import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler os dados da conta
        System.out.println("Por favor, digite o número da agência:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.println("Por favor, digite o nome da agência:");
        String Agencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        // a próxima linha formata o saldo para exibir até duas casas decimais
        String saldoFormatado = String.format("%.2f", saldo);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + Agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque.");

        scanner.close();
    }
}