package senac2022;

import java.util.Scanner;

public class segundaatividade1904 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[16];
        vetor[0] = 0;
        vetor[1] = 1;
        vetor[2] = 2;
        vetor[3] = 3;
        vetor[4] = 4;
        vetor[5] = 5;
        vetor[6] = 6;
        vetor[7] = 7;
        vetor[8] = 8;
        vetor[9] = 9;
        vetor[10] = 10;
        vetor[11] = 11;
        vetor[12] = 12;
        vetor[13] = 13;
        vetor[14] = 14;
        vetor[15] = 15;

        for(int listadenumeros : vetor) {
            if (listadenumeros % 2==0) {
                System.out.println("O numero " + listadenumeros + " e par!");
            } else {
                System.out.println("O numero " + listadenumeros + " e impar!");
            }


        }

    }
}
