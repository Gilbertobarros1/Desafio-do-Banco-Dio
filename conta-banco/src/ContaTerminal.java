import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuario

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        System.out.println("Por favor, Digite o numero da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agência");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome + " Obrigado por criar sua conta em nosso banco");
        System.out.println("Sua agência é "+ agencia + " Conta" + conta);
        System.out.println("Seu saldo de R$" + saldo + " Ja esta disponivel para saque!");
    }
}