package exercicios.arrays;
import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus antecessores e sucessores.
 */

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAletorios = new int[20];

        for (int i = 0; i < numerosAletorios.length; i++){
            int numero = random.nextInt(100);
            numerosAletorios[i] = numero;
        }

        //percorrendo o vetor utilizando foreach
        System.out.println("Números Sorteados: ");
        for (int numero : numerosAletorios){
            System.out.print(numero + " ");
        }

        //percorrendo o vetor utilizando foreach
        System.out.println("\nSucessores dos Números Sorteados: ");
        for (int numero : numerosAletorios){
            System.out.print((numero + 1) + " ");
        }
        //percorrendo o vetor utilizando foreach
        System.out.println("\nAntecessores dos Números Sorteados: ");
        for (int numero : numerosAletorios){
            System.out.print((numero - 1) + " ");
        }

    }
}
