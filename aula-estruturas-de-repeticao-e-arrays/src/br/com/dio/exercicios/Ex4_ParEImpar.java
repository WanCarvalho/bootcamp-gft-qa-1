package br.com.dio.exercicios;

/*Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N;
        int contador = 0;
        int numero;
        int quantidadePar = 0;
        int quantidadeImpar = 0;

        System.out.println("Quantidade de números digitados: ");
        N = scan.nextInt();

        System.out.println("Digite os números: ");

        do {

            numero = scan.nextInt();

            if (numero % 2 == 0) {
                quantidadePar += 1;
            }
            if (numero % 2 == 1) {
                quantidadeImpar += 1;
            }

            contador++;
        } while (contador < N);

        System.out.println("Par: " + quantidadePar);
        System.out.println("Ímpar: " + quantidadeImpar);
    }
}
