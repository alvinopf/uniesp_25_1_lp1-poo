package questao2;

public class Matematica {

    double numero1;
    double numero2;

    public void somar () {
        double soma = numero1 + numero2;
        System.out.println("A soma dos seus números é: "+soma);
    }

    public void subtrair () {
        double subtracao = numero1 - numero2;
        System.out.println("A subtração dos seus números é: "+subtracao);
    }

    public void dividir () {
        double divisao = numero1 / numero2;
        System.out.println("A divisão dos seus números é: "+divisao);
    }

    public void multiplicar () {
        double multiplicacao = numero1 * numero2;
        System.out.println("A multiplicação dos seus números é: "+multiplicacao);
    }

}
