package senac2022;

import java.util.Scanner;

public class QuintaAtividade1304 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas horas voce trabalhou como professor na escola APRENDER?");
        int quantashoras = input.nextInt();
        System.out.println("Qual o seu nivel de Professor? (1,2,3)");
        int nivel = input.nextInt();

        if (nivel == 1) {
            double resultado1 = 12 * quantashoras;
            System.out.println("Seu salario e " +resultado1+ " reais e seu nivel e 1, Bom trabalho!");
        } else if(nivel == 2) {
            double resultado2 = 17 * quantashoras;
            System.out.println("Seu salario e " +resultado2+ " reais e seu nivel e 2, Bom trabalho!");
        } else if(nivel ==3) {
            double resultado3 = 25 * quantashoras;
            System.out.println("Seu salario e " +resultado3+ " reais, e seu nivel e 3, Bom trabalho!");

        }
    }

}





