package senac2022;

public class MainPessoa {
    public static void main(String[] args) {
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
}
