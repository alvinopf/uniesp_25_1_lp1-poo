package questao2;

// Defina um sistema onde o usuário informe (na classe principal, através do teclado) qual opção deseja visualizar. Caso informe 1 ele vai ver a soma de dois números. Caso informe 2, vai ver a subtração, 3 divisão e 4 multiplicação. Observação: Estas operações deverão ser realizadas em uma classe chamada Matemática.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        int opcao;

        Scanner sc = new Scanner(System.in);
        Matematica m = new Matematica();

        do {

            System.out.println("Vamos realizar operações matemáticas entre dois números?");

            System.out.println("Digite um número:");
            m.numero1 = sc.nextInt();

            System.out.println("Digite outro número:");
            m.numero2 = sc.nextInt();

            System.out.println("Digite: \n- 1 para somar, \n- 2 para subtrair, \n- 3 para dividir, \n- 4 para multiplicar ou \n- qualquer outro número para encerrar.");

            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    m.somar();
                    break;
                case 2:
                    m.subtrair();
                    break;
                case 3:
                    m.dividir();
                    break;
                case 4:
                    m.multiplicar();
                    break;
                default:
            }

            System.out.println("Digite 0 para um novo cadastro ou qualquer outro número para encerrar.");

            r = sc.nextInt();

        }
        while (r == 0);
    }
}