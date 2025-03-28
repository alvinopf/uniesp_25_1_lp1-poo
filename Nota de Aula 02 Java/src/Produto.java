public class Produto {

    private String nome;
    private String codigo;
    private String cor;
    private double tamanhopeso;
    private double valor;
    private int quantidade;
    private double especie;
    private double ptd;
    private double credito;
    private double valorPago;
    private int parcelas;
    private double troco;
    private double valorParcela;
    private double valorPix;
    private double valorTransferenciaDebito;
    private int quantidadeCompra;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanhopeso() {
        return tamanhopeso;
    }
    public void setTamanhopeso(double tamanhopeso) {
        this.tamanhopeso = tamanhopeso;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getEspecie() {
        return especie;
    }
    public void setEspecie(double especie) {
        this.especie = especie;
    }

    public double getPtd() {
        return ptd;
    }
    public void setPtd(double ptd) {
        this.ptd = ptd;
    }

    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getValorPago() {
        return valorPago;
    }
    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public int getParcelas() {
        return parcelas;
    }
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double getTroco() {
        return troco;
    }
    public void setTroco(double troco) {
        this.troco = troco;
    }

    public double getValorParcela() {
        return valorParcela;
    }
    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public double getValorPix() {
        return valorPix;
    }
    public void setValorPix(double valorPix) {
        this.valorPix = valorPix;
    }

    public double getValorTransferenciaDebito() {
        return valorTransferenciaDebito;
    }
    public void setValorTransferenciaDebito(double valorTransferenciaDebito) {
        this.valorTransferenciaDebito = valorTransferenciaDebito;
    }

    public int getQuantidadeCompra() {
        return quantidadeCompra;
    }
    public void setQuantidadeCompra(int quantidadeCompra) {
        this.quantidadeCompra = quantidadeCompra;
    }

    public void venderPix() {
        if (quantidade >= quantidadeCompra) {
            valorPix = valor * 0.95 * quantidadeCompra;
            quantidade -= quantidadeCompra;
        } else {
            valorPix = -1;
        }
    }

    public void venderEspecie() {
        if (quantidade >= quantidadeCompra) {
            if (valorPago >= valor * quantidadeCompra) {
                troco = valorPago - valor * quantidadeCompra;
                quantidade -= quantidadeCompra;
            } else {
                troco = -1;
            }
        } else {
            troco = -2;
        }
    }

    public void venderTransferenciaDebito() {
        if (quantidade >= quantidadeCompra) {
            valorTransferenciaDebito = valor * 0.95 * quantidadeCompra;
            quantidade -= quantidadeCompra;
        } else {
            valorTransferenciaDebito = -1;
        }
    }

    public void venderCredito() {
        if (quantidade >= quantidadeCompra) {
            if (parcelas >= 1 && parcelas <= 3) {
                valorParcela = (valor * quantidadeCompra) / parcelas;
                quantidade -= quantidadeCompra;
            } else {
                valorParcela = -1;
            }
        } else {
            valorParcela = -2;
        }
    }
}