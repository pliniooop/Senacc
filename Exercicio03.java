Pedro Henrique de Carvalho Servulo
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int valor = 1;

        while (valor <= numero) {
            System.out.print(valor + " ");
            valor = valor * 2;
        }

        sc.close();
    }
}
