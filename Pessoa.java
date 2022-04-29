package senac2022;

public class Pessoa extends AbstractEmpresaPessoa {

    private String nomeDaPessoa;
    private String cpf;
    private String rg;
    private String dataDeNascimento;
    private String signo;
    private String sexo;
    private double altura;
    private String peso;
    private String religiao;

    @Override
    public void salvar() {

        Pessoa pessoa = new Pessoa();

        pessoa.setRg("43.123.512");
        pessoa.setNomeDaPessoa("Gustavo");
        pessoa.setCpf("123.456.789-11");
        pessoa.setDataDeNascimento("13/12/1987");
        pessoa.setSigno("Leao");
        pessoa.setSexo("Masculino");
        pessoa.setAltura(1.86);
        pessoa.setPeso("78 Kg");
        pessoa.setReligiao("Cristao");

        System.out.println("Pessoa cadastrada com sucesso!");
    }

    @Override
    public void editar() {
        System.out.println("Editado com sucesso!");

    }

    @Override
    public void excluir() {
        System.out.println("Excluido com sucesso!");

    }

    @Override
    public void listar() {
        System.out.println("Busca efetivada com sucesso!");

    }

    public String getNomeDaPessoa() {
        return nomeDaPessoa;
    }

    public void setNomeDaPessoa(String nomeDaPessoa) {
        this.nomeDaPessoa = nomeDaPessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }
}




