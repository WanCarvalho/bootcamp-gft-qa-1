package one;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MesDoAno mesDoAno = new MesDoAno();

        System.out.println("Digite um número para saber o mês do ano referente: ");
        int numMes = scan.nextInt();

        System.out.print(mesDoAno.retornaMesDoAno(numMes));
    }
}
