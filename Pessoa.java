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

    }

    @Override
    public void editar() {

    }

    @Override
    public void excluir() {

    }

    @Override
    public void listar() {

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




