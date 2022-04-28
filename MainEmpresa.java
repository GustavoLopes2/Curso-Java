package senac2022;

public class MainEmpresa {
    public static void main(String[] args) {
       Empresa empresa = new Empresa();

       empresa.setNomeDaEmpresa("3G");
       empresa.setCnpj("0000235908959");
       empresa.setInscricaoEstadual("438385701110");
       empresa.setDataDeAbertura("19/04/1989");
       empresa.setEmail("funilaria3G@gmail.com");
       empresa.setEndereco("Avenia Esmeraldas");
       empresa.setNumero(4001);
       empresa.setBairro("Jardim Tangará");
       empresa.setCidade("Marilía");
       empresa.setEstado("São Paulo");
       empresa.setTelefone(1433164106);
       empresa.setCelular("(11) 99351-5312");

       System.out.println(empresa.getNomeDaEmpresa() + "\n" + empresa.getCnpj() + "\n" + empresa.getInscricaoEstadual() + "\n" + empresa.getDataDeAbertura() + "\n" + empresa.getEmail() + "\n" +
               empresa.getEndereco() + "\n" + empresa.getNumero() + "\n" + empresa.getBairro() + "\n" + empresa.getCidade() + "\n" + empresa.getCidade() + "\n" + empresa.getEstado() + "\n" + empresa.getTelefone()
        + "\n" + empresa.getCelular());


    }
}
