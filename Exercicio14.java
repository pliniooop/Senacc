import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        double somaMedias = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Aluno " + i);

            System.out.print("Digite a 1ª nota: ");
            double nota1 = sc.nextDouble();

            System.out.print("Digite a 2ª nota: ");
            double nota2 = sc.nextDouble();

            double media = (nota1 + nota2) / 2;
            somaMedias += media;

            System.out.println("Média: " + media);

            if (media <= 3) {
                System.out.println("REPROVADO");
                reprovados++;
            } else if (media < 7) {
                System.out.println("EXAME");
                exame++;
            } else {
                System.out.println("APROVADO");
                aprovados++;
            }

            System.out.println("-------------------");
        }

        double mediaClasse = somaMedias / 6;

        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de exame: " + exame);
        System.out.println("Total de reprovados: " + reprovados);
        System.out.println("Média da classe: " + mediaClasse);

        sc.close();
    }
}