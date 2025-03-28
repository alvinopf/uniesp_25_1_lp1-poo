package questao4;

public class Cliente {

    private String nome;
    private double saldo;
    private double valorSacado;
    private double valorDepositado;
    private double valorTransferido;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setValorSacado(double valorSacado) {
        this.valorSacado = valorSacado;
    }

    public void setValorDepositado(double valorDepositado) {
        this.valorDepositado = valorDepositado;
    }

    public void setValorTransferido(double valorTransferido) {
        this.valorTransferido = valorTransferido;
    }

    public void exibirSaldo (){
        System.out.println("O cliente " + nome + " possui R$" + saldo + " reais de saldo na sua conta bancária.");
    }

    public void sacarSaldo (){
        if (saldo > 0) {
            if (saldo >= valorSacado) {
                saldo = saldo - valorSacado;
                System.out.println("A operação foi realizada. O cliente " + nome + " agora possui R$" + saldo + " reais de saldo na conta bancária.");
            } else {
                saldo = saldo - valorSacado;
                System.out.println("A operação foi realizada, mas o cliente " + nome + " agora possui o saldo negativo de R$" + saldo + " reais na conta bancária.");
            }
        } else {
            System.out.println("O cliente " + nome + " não possui saldo na conta. A operação não foi realizada.");
        }

    }

    public void depositarSaldo () {
        saldo = saldo + valorDepositado;
        System.out.println("A operação foi realizada. O cliente " + nome + " agora possui R$" + saldo + " reais de saldo na conta bancária.");
    }

    public void transferirSaldo () {
        if (saldo > 0) {
            if (saldo >= valorTransferido) {
                saldo = saldo - valorTransferido;
                System.out.println("A operação foi realizada. O cliente " + nome + " agora possui R$" + saldo + " reais de saldo na conta bancária.");
            } else {
                saldo = saldo - valorTransferido;
                System.out.println("A operação foi realizada, mas o cliente " + nome + "agora possui o saldo negativo de R$" + saldo + " reais na conta bancária.");
            }
        } else {
            System.out.println("O cliente " + nome + " não possui saldo na conta. A operação não será realizada.");
        }
    }

}
