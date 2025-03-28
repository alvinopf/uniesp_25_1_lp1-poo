package questao4;

// Elabore um programa que simule um sistema bancário de um cliente. Inicialmente o saldo está zerado, mas o cliente pode escolher qualquer uma das seguintes opções do menu: • Consultar saldo • Depositar • Sacar • Transferir. Uma observação é que o cliente só pode sacar e transferir se o saldo da conta não estiver zerado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int reverMenuCadastro;
        int reverMenuContaB;
        int opcaoContaB;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Cliente c = new Cliente ();

        do {

            System.out.println("Sistema Bancário.");

            System.out.println("Digite o nome do cliente:");
            c.setNome(sc2.nextLine());

            System.out.println("O saldo inicial é de R$0,00 reais. Digite o novo saldo inicial da conta bancária do cliente:");
            c.setSaldo(sc.nextDouble());

            do {

                System.out.println("Digite:\n 1 para consultar o saldo atual,\n 2 para sacar dinheiro da conta,\n 3 para depositar dinheiro na conta ou\n 4 para transferir dinheiro para outra conta.");
                opcaoContaB = sc.nextInt();

                switch (opcaoContaB) {
                    case 1:
                        c.exibirSaldo();
                        break;
                    case 2:
                        System.out.println("Qual o valor o cliente " + c.getNome() + " deseja sacar da conta bancária?");
                        c.setValorSacado(sc.nextInt());
                        c.sacarSaldo();
                        break;
                    case 3:
                        System.out.println("Qual o valor o cliente " + c.getNome() + " deseja depositar na conta bancária?");
                        c.setValorDepositado(sc.nextInt());
                        c.depositarSaldo();
                        break;
                    case 4:
                        System.out.println("Qual o valor o cliente " + c.getNome() + " deseja transferir para outra conta bancária?");
                        c.setValorTransferido(sc.nextInt());
                        c.transferirSaldo();
                        break;
                    default:
                }

                System.out.println("Digite 0 para rever o menu ou outro número para encerrar.");
                reverMenuContaB = sc.nextInt();

            }
            while (reverMenuContaB == 0);

            System.out.println("Digite 0 para um novo cadastro ou outro número para encerrar.");
            reverMenuCadastro = sc.nextInt();

        }
        while (reverMenuCadastro == 0);

    }
}