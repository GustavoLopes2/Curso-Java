package senac2022;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.getNome();
        produto.getDescrição();
        produto.getValor();
        produto.getValorNaPromoção();
        produto.getDataDeVencimento();
        produto.getCodigoDeBarra();

        System.out.println(produto.getNome() + "\n" + produto.getDescrição() + "\n" + produto.getValor() + "\n" + produto.getValorNaPromoção() + "\n" + produto.getDataDeVencimento() + "\n" +
                produto.getCodigoDeBarra());
    }
}
