package senac2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeFor01 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        List listaDeEmails = new ArrayList();

        listaDeEmails.add("gustavo@aluno.pr.senac.br");
        listaDeEmails.add("eduardo@aluno.pr.senac.br");
        listaDeEmails.add("marcos@aluno.pr.senac.br");
        listaDeEmails.add("joao@aluno.pr.senac.br");
        listaDeEmails.add("maria@aluno.pr.senac.br");

        for (Object lista : listaDeEmails) {
            System.out.println(lista);
        }
    }
}

