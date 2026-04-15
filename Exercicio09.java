Pedro Henrique de Carvalho Servulo
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double totalCompra = 0;
        String continuar = "s";

        do {
            System.out.print("Digite o código do produto: ");
            codigo = sc.nextInt();

            System.out.print("Digite a quantidade: ");
            quantidade = sc.nextInt();

            double preco = 0;
            String nome = "";

            switch (codigo) {
                case 100:
                    nome = "Cachorro quente";
                    preco = 1.20;
                    break;
                case 101:
                    nome = "Bauru simples";
                    preco = 1.30;
                    break;
                case 102:
                    nome = "Bauru com ovo";
                    preco = 1.50;
                    break;
                case 103:
                    nome = "Hamburguer";
                    preco = 1.20;
                    break;
                case 104:
                    nome = "Cheeseburguer";
                    preco = 1.30;
                    break;
                case 105:
                    nome = "Refrigerante";
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }

            double totalProduto = preco * quantidade;
            totalCompra += totalProduto;

            System.out.println(nome + " - Total: R$ " + totalProduto);

            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Valor total da compra: R$ " + totalCompra);

        sc.close();
    }
}
