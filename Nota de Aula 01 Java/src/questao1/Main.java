package questao1;

// Defina uma classe Aluno que faça o cadastro do nome e das 3 notas e a operação do cálculo da média. Ao final, exiba (na classe principal) a média. Em seguida, informe se ele está aprovado, reprovado ou na final. Se a média for >= 70 está aprovado, abaixo de 40 está reprovado, senão, está na final.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Aluno a = new Aluno ();

        do {

            System.out.println("Vamos verificar a sua média e aprovação?");

            System.out.println("Digite o seu nome completo:");
            a.setNome(sc2.nextLine());

            System.out.println("Digite a sua primeira nota:");
            a.setNota1(sc.nextDouble());

            System.out.println("Digite a sua segunda nota:");
            a.setNota2(sc.nextDouble());

            System.out.println("Digite a sua terceira nota:");
            a.setNota3(sc.nextDouble());

            a.calcularMedia();

            if (a.getMedia() >= 7) {
                System.out.println("Parabéns! Sua média é " + a.getMedia() + "! Você está aprovado!");
            } else if (a.getMedia() >= 4 && a.getMedia() < 7) {
                System.out.println("Que pena! Sua média é " + a.getMedia() + "! Você está na final!");
            } else {
                System.out.println("Poxa vida! Sua média é " + a.getMedia() + "! Você foi reprovado!");
            }

            System.out.println("Digite 0 para um novo cadastro ou qualquer outro número para encerrar.");

            r = sc.nextInt();
        }
        while (r == 0);
    }
}
