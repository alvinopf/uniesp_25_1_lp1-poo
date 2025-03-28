
// Crie um sistema para controle de um produto com atributos código, nome, tamanho/peso, cor, valor e quantidade no estoque. O sistema deve permitir o cadastro dos dados, além de realizar a venda e fazer o controle do estoque. Para o pagamento, temos os seguintes benefícios: Pix, Espécie, Transferência ou Débito, 5% de desconto. Crédito, parcelar em 3x sem juros. Observação: Espécie, caso o valor pago seja maior que o valor do produto, informar o troco.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcaoPrincipal;
        int reverMenuPrincipal;
        int opcaoVenda;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();

        do {
            System.out.println("Sistema de cadastro e venda de produtos! Escolha entre as opções a seguir:");

            System.out.println("Digite:\n 1 para realizar o cadastro de um produto ou\n 2 para realizar a venda de um produto cadastrado.");
            opcaoPrincipal = sc.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    p.setNome(sc2.nextLine());

                    System.out.println("Digite o código do produto:");
                    p.setNome(sc2.next());

                    System.out.println("Digite a cor do produto:");
                    p.setNome(sc2.next());

                    System.out.println("Digite o tamanho/peso do produto:");
                    p.setTamanhopeso(sc.nextDouble());

                    System.out.println("Digite o valor do produto:");
                    p.setValor(sc.nextDouble());

                    System.out.println("Digite a quantidade do produto no estoque:");
                    p.setQuantidade(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Digite:\n 1 para realizar a venda por Pix,\n 2 para realizar a venda em Espécie,\n 3 para realizar a venda por Transferência ou Débito ou\n 4 para realizar a venda por Crédito.");
                    opcaoVenda = sc.nextInt();

                    System.out.println("Digite a quantidade que deseja comprar:");
                    p.setQuantidadeCompra(sc.nextInt());

                    switch (opcaoVenda) {
                        case 1:
                            System.out.println("Você está vendendo um produto por Pix.");
                            p.venderPix();
                            if (p.getValorPix() >= 0) {
                                System.out.println("O valor a ser pago é: R$" + p.getValorPix());
                            } else {
                                System.out.println("Estoque insuficiente.");
                            }
                            break;
                        case 2:
                            System.out.println("Você está vendendo um produto em Espécie.");
                            System.out.println("Digite o valor pago pelo cliente:");
                            p.setValorPago(sc.nextDouble());
                            p.venderEspecie();
                            if (p.getTroco() >= 0) {
                                System.out.println("O troco é: R$" + p.getTroco());
                            } else if (p.getTroco() == -1) {
                                System.out.println("Valor pago insuficiente.");
                            } else {
                                System.out.println("Estoque insuficiente.");
                            }
                            break;
                        case 3:
                            System.out.println("Você está vendendo um produto por Transferência ou Débito");
                            p.venderTransferenciaDebito();
                            if (p.getValorTransferenciaDebito() >= 0) {
                                System.out.println("O valor a ser pago é: R$" + p.getValorTransferenciaDebito());
                            } else {
                                System.out.println("Estoque insuficiente.");
                            }
                            break;
                        case 4:
                            System.out.println("Você está vendendo um produto por Crédito.");
                            System.out.println("Digite o número de parcelas (1, 2 ou 3):");
                            p.setParcelas(sc.nextInt());
                            p.venderCredito();
                            if (p.getValorParcela() >= 0) {
                                System.out.println("O valor de cada parcela é: R$" + p.getValorParcela());
                            } else if (p.getValorParcela() == -1) {
                                System.out.println("Número de parcelas inválido.");
                            } else {
                                System.out.println("Estoque insuficiente.");
                            }
                            break;
                        default:
                    }

                    break;
                default:
            }
            System.out.println("Digite 0 para rever o menu principal ou outro número para encerrar.");
            reverMenuPrincipal = sc.nextInt();
        } while (reverMenuPrincipal == 0);
    }
}