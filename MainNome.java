package senac2022;

public class MainNome {

    public static void main(String[] args) {
        Nome nome = new Nome();

        nome.setNome("Lopes");
        nome.setIdade("18");
        nome.setNotaDoAluno(10);

        System.out.println(nome.getNome() + "\n" + nome.getIdade() + "\n" + nome.getNotaDoAluno());
    }
}
