package br.com.dio.exercicios;
import java.util.Scanner;

/*Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.*/

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Deseja ver a tabuada de: ");
        int tabuadaEscolhida = scan.nextInt();

        System.out.println("TABUADA DE " + tabuadaEscolhida);

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " x " + tabuadaEscolhida + " = " + i*tabuadaEscolhida);
        }


    }
}
