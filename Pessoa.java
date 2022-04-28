package senac2022;

public class Pessoa extends AbstractEmpresaPessoa {

    public String nomeDaPessoa;
    public String cpf;
    public String rg;
    public String dataDeNascimento;
    public String signo;
    public String sexo;
    public double altura;
    public String peso;
    public String religiao;

    @Override
    public void salvar() {

        System.out.println("Pessoa salva!");

        Pessoa pessoa = new Pessoa();

        pessoa.setNomeDaPessoa("Gustavo");
        pessoa.setCpf("123.456.789-11");
        pessoa.setDataDeNascimento("13/12/1987");
        pessoa.setSigno("Leao");
        pessoa.setSexo("Masculino");
        pessoa.setAltura(1.86);
        pessoa.setPeso("78 Kg");
        pessoa.setReligiao("Cristao");

        System.out.println(pessoa.getNomeDaPessoa() + "\n" + pessoa.getCpf() + "\n" + pessoa.getDataDeNascimento() + "\n" + pessoa.getSigno() + "\n" + pessoa.getSexo() + "\n" + pessoa.getAltura() + "\n" + pessoa.getPeso() +
                "\n" + pessoa.getReligiao());
    }

    @Override
    public void editar() {
        System.out.println("Pessoa editada com sucesso!");

    }

    @Override
    public void excluir() {
        System.out.println("Pessoa excluida com sucesso!");

    }

    @Override
    public void listar() {
        System.out.println("Pessoa listada com sucesso!");

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




