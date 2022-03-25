package br.com.dio.exercicios;
/*Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido*/

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.print("Nota: ");
        nota = scan.nextInt();

        //o laço só é finalizado quando uma nota válida é digitada
        while((0 > nota) || (nota > 10)) {
            System.out.print("Digite uma nota válida: ");
            nota = scan.nextInt();
        }

        System.out.println("Nota de valor " + nota + " salva!");
    }
}
