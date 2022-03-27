package exercicios.arrays;
/*Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetorNumeros = {1,3,45,6,56,8};
        int contador = 0;

        System.out.print("Vetor: ");
        while(contador < vetorNumeros.length){
            System.out.print(vetorNumeros[contador] + ", ");
            contador++;
        }

        System.out.print("\n\nVetor em ordem inversa: ");
        for (int i = (vetorNumeros.length-1); i >= 0; i--){
            System.out.print(vetorNumeros[i] + ", ");
        }
    }
}
