import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        int nulos = 0, brancos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o voto do eleitor " + i + ": ");
            int voto = sc.nextInt();

            switch (voto) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    nulos++;
                    break;
                case 6:
                    brancos++;
                    break;
                default:
                    System.out.println("Voto inválido!");
                    i--; // repete esse eleitor
            }
        }

        int totalVotos = 10;

        double percNulos = (nulos * 100.0) / totalVotos;
        double percBrancos = (brancos * 100.0) / totalVotos;

        System.out.println("Votos candidato 1: " + c1);
        System.out.println("Votos candidato 2: " + c2);
        System.out.println("Votos candidato 3: " + c3);
        System.out.println("Votos candidato 4: " + c4);
        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos em branco: " + brancos);
        System.out.println("Percentual de nulos: " + percNulos + "%");
        System.out.println("Percentual de brancos: " + percBrancos + "%");

        sc.close();
    }
}
