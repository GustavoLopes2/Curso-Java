package senac2022;

public class Produto {

    private String nome = "Snickers";
    private String descrição = "Alimento para matar a fome!";
    private double valor = 3.99;
    private double valorNaPromoção = 2.99;
    private String dataDeVencimento = "14/08/2022";
    private int codigoDeBarra = 1256867424;

    public String getNome() {
        return nome;
    }
    public String getDescrição() {
        return descrição;
    }
    public double getValor() {
        return valor;
    }
    public double getValorNaPromoção() {
        return valorNaPromoção;
    }
    public String getDataDeVencimento() {
        return dataDeVencimento;
    }
    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }

}
