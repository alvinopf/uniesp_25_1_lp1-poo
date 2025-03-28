package questao3;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private int novasUnidades;
    private int unidadesVendidas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setNovasUnidades(int novasunidades) {
        this.novasUnidades = novasunidades;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public void adicionarEstoque () {
        quantidade = quantidade + novasUnidades;
        System.out.println("A operação foi realizada. A empresa agora possui " + quantidade + " unidades do produto " + nome + ".");
    }

    public void venderProduto () {
        if (quantidade >= unidadesVendidas) {
            quantidade = quantidade - unidadesVendidas;
            double valorVenda = unidadesVendidas * preco;
            System.out.println("A operação foi realizada. Foram vendidas " + unidadesVendidas + " unidades do produto " + nome + " por R$" + valorVenda + " reais e a empresa agora possui " + quantidade + " unidades no estoque.");
        } else {
            System.out.println("A empresa não possui estoque suficiente do produto " + nome + ". A operação não foi realizada.");
        }
    }

    public void exibirEstoque () {
        System.out.println("A empresa possui " + quantidade + " do produto " + nome + " no estoque!");
    }

}