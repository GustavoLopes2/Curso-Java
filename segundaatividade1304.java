package senac2022;

import java.util.Scanner;

public class segundaatividade1304 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Coloque um numero inteiro");
        int a = input.nextInt();
        System.out.println("Coloque outro numero inteiro");
        int b = input.nextInt();

        if (a >= b) {
            System.out.println(a + " e o maior entre os dois numeros");
        } else {
            if (a <= b) {
                System.out.println(b + " e o maior entre os dois numeros");

            }
        }
    }
}
