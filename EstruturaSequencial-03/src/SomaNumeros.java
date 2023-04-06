import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt(); // Lê um número inteiro digitado pelo usuário

        // Solicitar ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt(); // Lê um número inteiro digitado pelo usuário

        // Calcular a soma dos números
        int soma = numero1 + numero2;

        // Exibir o resultado da soma
        System.out.println("A soma dos números é: " + soma);

        // Fechar o objeto Scanner
        scanner.close();
    }
}
