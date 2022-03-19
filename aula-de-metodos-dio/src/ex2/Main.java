//A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde ou Boa noite.

package ex2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Que horas são?");
        int horas = scan.nextInt();

        if (horas > 5 && horas < 12){
            System.out.println("Bom dia!");
        }else if (horas >= 12 && horas < 18){
            System.out.println("Boa tarde!");
        }else if (horas >= 18 || horas < 5){
            System.out.println("Boa noite!");
        }

    }
}
