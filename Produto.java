package senac2022;

public class Produto extends ProdutoAbstract {

    private String nome;
    private String descricao;
    private double valor;
    private double valorNaPromocao;
    private String dataDeVencimento;
    private int codigoDeBarra;

    @Override
    public void salvar() {

    }

    @Override
    public Produto buscarProdutoPorId() {
        return null;
    }

    @Override
    public void excluir() {

    }

    @Override
    public void editar() {

    }

    @Override
    public void listar() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorNaPromocao() {
        return valorNaPromocao;
    }

    public void setValorNaPromocao(double valorNaPromocao) {
        this.valorNaPromocao = valorNaPromocao;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(int codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }
}