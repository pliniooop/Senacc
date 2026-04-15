Pedro Henrique de Carvalho Servulo
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aluno = 1;

        while (aluno <= 5) {
            double nota1, nota2;

            // validação da primeira nota
            do {
                System.out.print("Digite a 1ª nota do aluno " + aluno + ": ");
                nota1 = sc.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! Digite entre 0 e 10.");
                }

            } while (nota1 < 0 || nota1 > 10);

            // validação da segunda nota
            do {
                System.out.print("Digite a 2ª nota do aluno " + aluno + ": ");
                nota2 = sc.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! Digite entre 0 e 10.");
                }

            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;

            System.out.println("Média do aluno " + aluno + ": " + media);
            System.out.println("---------------------------");

            aluno++;
        }

        sc.close();
    }
}
