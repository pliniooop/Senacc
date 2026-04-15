import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int numero;
        int menor = Integer.MAX_VALUE;

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            numero = sc.nextInt();

            if (numero > 0) { // garante que é positivo
                if (numero < menor) {
                    menor = numero;
                }
                contador++;
            } else {
                System.out.println("Digite apenas números positivos!");
            }
        }

        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}