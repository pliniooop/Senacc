Pedro Henrique de Carvalho Servulo
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int numero;
        int pares = 0;
        int impares = 0;

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            contador++;
        }

        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);

        sc.close();
    }
}
