package senac2022;

import java.util.Scanner;

public class atividade1304 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira seu nome");
        String seunome = input.next();
        System.out.println("Insira sua primeira nota");
        int a = input.nextInt();
        System.out.println("Insira sua segunda nota");
        int b = input.nextInt();
        System.out.println("Insira sua terceira nota");
        int c = input.nextInt();
        double resultado = (a + b + c) / 3;

        if (resultado >= 7) {
            System.out.println(seunome + ", parabens voce foi aprovado");

        } else {        if (resultado <= 5) {
            System.out.println(seunome + ", voce foi reprovado");

        } else {        if (resultado >= 5.1 || resultado <= 6.9) {
                System.out.println(seunome + ", quase vai precisar fazer a recuperacao");

            }


        }

    }

}}