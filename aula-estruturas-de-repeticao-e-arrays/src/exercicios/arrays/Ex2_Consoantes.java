package exercicios.arrays;
/*Faça um programa que leia um vetor de 6 char's,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] letras = new String[6];
        String[] consoantes = new String[6];

        int contadorConsoantes = 6;
        int indexConsoantes = 0;

        //laço que recebe e salva na posição do array, as letras digitadas
        System.out.println("Digite 6 characteres: ");
        for (int i = 0; i < letras.length; i++){
            letras[i] = scan.next();

            //caso a letra digitada seja vogal, subtrai 1 do valor do contador de consoantes
                if (letras[i].equalsIgnoreCase("a") |
                        letras[i].equalsIgnoreCase("e") |
                        letras[i].equalsIgnoreCase("i") |
                        letras[i].equalsIgnoreCase("o") |
                        letras[i].equalsIgnoreCase("u")) {
                    contadorConsoantes--;
                } else {
                    consoantes[indexConsoantes] = letras[i];
                    indexConsoantes++;
                }
        }

        //imprime as letras digitadas pelo usuário
        System.out.println("Letras digitadas: ");
        for (int i = 0; i < letras.length; i++){
            System.out.print(letras[i] + ", ");
        }

        System.out.println("\nQuantidade de Consoantes: " + contadorConsoantes);

        //imprime as consoantes digitadas pelo usuário
        System.out.println("Consoantes digitadas: ");
        for (int i = 0; i < consoantes.length; i++){
            //condição para imprimir as consoantes, escodendo os espaços do vetor que estão nulos
            if (consoantes[i] != null){
                System.out.print(consoantes[i] + ", ");
            }

        }
    }
}
