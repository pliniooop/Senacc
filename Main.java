import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        if (numero > 20) {
            int metade = numero / 2;
            System.out.println("A metade do número é: " + metade);
        }

        scanner.close();
    }
}