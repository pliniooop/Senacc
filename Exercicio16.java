Pedro Henrique de Carvalho Servulo
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maiores50 = 0;
        int contAltura = 0;
        double somaAlturas = 0;
        int abaixo40 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i);

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            System.out.print("Digite a altura: ");
            double altura = sc.nextDouble();

            System.out.print("Digite o peso: ");
            double peso = sc.nextDouble();

            // a) maiores de 50 anos
            if (idade > 50) {
                maiores50++;
            }

            // b) média alturas entre 10 e 20 anos
            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                contAltura++;
            }

            // c) peso inferior a 40 kg
            if (peso < 40) {
                abaixo40++;
            }
        }

        // cálculo da média
        double mediaAlturas = 0;
        if (contAltura > 0) {
            mediaAlturas = somaAlturas / contAltura;
        }

        // cálculo da porcentagem
        double porcentagem = (abaixo40 * 100.0) / 10;

        System.out.println("Pessoas com mais de 50 anos: " + maiores50);
        System.out.println("Média das alturas (10 a 20 anos): " + mediaAlturas);
        System.out.println("Porcentagem com peso abaixo de 40kg: " + porcentagem + "%");

        sc.close();
    }
}
