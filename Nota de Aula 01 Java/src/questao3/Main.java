package questao3;

// Crie uma classe chamada "Produto" que representará um produto com os atributos nome, preço e quantidade em estoque. Implemente métodos para adicionar estoque e vender unidades do produto. Na classe principal, crie um objeto Produto, realize operações de: • Adicionar estoque • Vender produtos • Exibir o estoque.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int reverMenuCadastro;
        int opcaoEstoque;
        int reverMenuEstoque;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();

        do {

            System.out.println("Sistema de cadastro de produtos.");

            System.out.println("Digite o nome do produto:");
            p.setNome(sc2.nextLine());

            System.out.println("Digite o valor do produto:");
            p.setPreco(sc.nextDouble());

            System.out.println("Digite a quantidade do produto em estoque:");
            p.setQuantidade(sc.nextInt());

            do {

                System.out.println("Digite:\n 1 para adicionar novas unidades do produto " + p.getNome() + " ao estoque\n 2 para vender unidades do produto " + p.getNome() + " ou\n 3 para exibir o estoque atual do produto " + p.getNome() + ".");
                opcaoEstoque = sc.nextInt();

                switch (opcaoEstoque) {
                    case 1:
                        System.out.println("Quantas unidades do produto " + p.getNome() + "você deseja adicionar ao estoque?");
                        p.setNovasUnidades(sc.nextInt());
                        p.adicionarEstoque();
                        break;
                    case 2:
                        System.out.println("Quantas unidades do produto " + p.getNome() + " você deseja vender?");
                        p.setUnidadesVendidas(sc.nextInt());
                        p.venderProduto();
                        break;
                    case 3:
                        p.exibirEstoque();
                        break;
                    default:
                }

                System.out.println("Digite 0 para rever o menu ou qualquer outro número para encerrar.");
                reverMenuEstoque = sc.nextInt();

            }
            while (reverMenuEstoque == 0);

            System.out.println("Digite 0 para um novo cadastro ou qualquer outro número para encerrar.");
            reverMenuCadastro = sc.nextInt();

        }
        while (reverMenuCadastro == 0);
    }
}