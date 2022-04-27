package senac2022;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Snickers");
        produto.setDescricao("Mata sua foma a qualquer hora!");
        produto.setValor(3.99);
        produto.setValorNaPromocao(2.99);
        produto.setDataDeVencimento("Data de vencimento 14/08/2022");
        produto.setCodigoDeBarra(16235772);

        System.out.println(produto.getNome() + "\n" + produto.getDescricao() + "\n" + produto.getValor() + "\n" + produto.getValorNaPromocao() + "\n" + produto.getDataDeVencimento() + "\n" +
                produto.getCodigoDeBarra());
    }
}
