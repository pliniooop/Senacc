Pedro Henrique De Carvalho Servulo
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.print("Sequência: ");

        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
