package br.com.dio.exercicios;
import java.util.Scanner;

/* Faça um programa que leia 5 números e informe
o maior número, e a média desses números. */

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numero = new int[5];
        int contador = 0;
        int maiorNumero = 0;
        int soma = 0;

        System.out.println("Digite 5 números: ");
        
        do {

            numero[contador] = scan.nextInt();
            soma = soma + numero[contador];

            //código para imprimir maior número (exceto com números negativos)
            if (numero[0] == 0){
                maiorNumero = numero[contador];
            }if (numero[contador] > maiorNumero){
                maiorNumero = numero[contador];
            }

            contador++;

        } while (contador < numero.length);

        for (int j = 0; j < (numero.length); j++){
            //acrescenta vírgula até o penúltimo número
            if (j != 4) {
                System.out.print(numero[j] + ", ");
            }

            //acrescenta ponto final no último número
            if (j == 4){
                System.out.println(numero[j] + ".");
            }
        }

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Média: " + (soma/numero.length));//mostra a média arredondada


    }
}
