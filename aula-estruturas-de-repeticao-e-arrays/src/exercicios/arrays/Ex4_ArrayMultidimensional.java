package exercicios.arrays;
import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9
 */

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                matriz[linha][coluna] = random.nextInt(9);
            }
        }

        //atribuição de valores aleatórios aos espações da matriz
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.print(matriz[linha][coluna] + " ");

                //condição para pular linha ao chegar no ultimo elemento da coluna
                if (coluna == matriz.length-1){
                    System.out.print("\n");
                }
            }
        }
    }
}
