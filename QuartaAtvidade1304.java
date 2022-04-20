package senac2022;

import java.util.Scanner;

public class QuartaAtvidade1304 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int a = input.nextInt();
        System.out.println("Digite outro numero inteiro");
        int b = input.nextInt();

        if (a >= b) {
            int c = a - b;
            System.out.println("A diferenca entre os numeros e");
            System.out.println(a - b);

        } else if (b >= a) {
            int c = b - a;
            System.out.println("A diferenca entre os numeros e");
            System.out.println(b - a);
        }




}   }