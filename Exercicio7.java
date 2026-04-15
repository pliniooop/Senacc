import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int dentroPesoIdeal = 0;

        while (contador <= 10) {
            System.out.println("Pessoa " + contador);

            System.out.print("Digite a altura (em metros): ");
            double altura = sc.nextDouble();

            System.out.print("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            double imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.9) {
                dentroPesoIdeal++;
            }

            contador++;
        }

        System.out.println("Quantidade de pessoas com IMC entre 18,5 e 24,9: " + dentroPesoIdeal);

        sc.close();
    }
}