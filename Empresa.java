package senac2022;

public class Empresa extends AbstractEmpresaPessoa {

    private String nomeDaEmpresa;
    private String cnpj;
    private String inscricaoEstadual;
    private String dataDeAbertura;
    private String email;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private double telefone;
    private String celular;

    @Override
    public void salvar() {

        Empresa empresa = new Empresa();
        empresa.setNomeDaEmpresa("3G");
        empresa.setCnpj("0000235908959");
        empresa.setInscricaoEstadual("438385701110");
        empresa.setDataDeAbertura("19/04/1989");
        empresa.setEmail("funilaria3G@gmail.com");
        empresa.setEndereco("Avenia Esmeraldas");
        empresa.setNumero(4001);
        empresa.setBairro("Jardim Tangara");
        empresa.setCidade("Marilia");
        empresa.setEstado("Sao Paulo");
        empresa.setTelefone(1433164106);
        empresa.setCelular("(11) 99351-5312");

        System.out.println("Empresa Cadastrada!");

    }

    @Override
    public void editar() {
        System.out.println("Empresa editada!");

    }

    @Override
    public void excluir() {
        System.out.println("Empresa excluida!");

    }
    @Override
    public void listar() {
        System.out.println("Empresa listada!");

    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}


