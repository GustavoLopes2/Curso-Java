package senac2022;

import com.sun.source.tree.LambdaExpressionTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atividade1904 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        String[] listadenomes = new String[5];
        listadenomes[0] = "Marcos";
        listadenomes[1] = "Thiago";
        listadenomes[2] = "Pietro";
        listadenomes[3] = "Rubens";
        listadenomes[4] = "Gabriel";

        System.out.println("Digite um nome");
        String nome = input.next();

        for (int i = 0; i < listadenomes.length; i++) {
            if (listadenomes[i] != null && listadenomes[i].equals(nome)) {
                System.out.println(nome + " Sua posicao em matriz e " + i);
                break;
            } else {
                System.out.println("O " + nome + " nao foi encontrado na posicao " + i);
            }

        }

    }

}