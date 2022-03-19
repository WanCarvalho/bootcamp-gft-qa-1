package ex1;
import java.util.Scanner;

public class Main extends OperacoesBasicas{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma operação para realizar: \n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n0- Finalizar");
        int operacao = scan.nextInt();


        while (operacao != 0) {
            if (operacao == 1) {
                System.out.println("Digite dois números para realizar a soma: ");
                int primeiroNumero = scan.nextInt();
                int segundoNumero = scan.nextInt();

                System.out.println(primeiroNumero + " + " + segundoNumero + " = " + somar(primeiroNumero, segundoNumero));
            } else if (operacao == 2) {
                System.out.println("Digite dois números para realizar a subtração: ");
                int primeiroNumero = scan.nextInt();
                int segundoNumero = scan.nextInt();

                System.out.println(primeiroNumero + " - " + segundoNumero + " = " + subtrair(primeiroNumero, segundoNumero));
            } else if (operacao == 3) {
                System.out.println("Digite dois números para realizar a multiplicação: ");
                int primeiroNumero = scan.nextInt();
                int segundoNumero = scan.nextInt();

                System.out.println(primeiroNumero + " * " + segundoNumero + " = " + multiplicar(primeiroNumero, segundoNumero));
            } else if (operacao == 4) {
                System.out.println("Digite dois números para realizar a divisão: ");
                int primeiroNumero = scan.nextInt();
                int segundoNumero = scan.nextInt();

                System.out.println(primeiroNumero + " - " + segundoNumero + " = " + dividir(primeiroNumero, segundoNumero));
            } else if(operacao == 0){
                System.out.println("Você finalizou as operações! Obrigado por utilizar nossa calculadora de operações básicas.");
            }else {
                System.out.println("Você digitou um número inválido!");
                System.out.println("Digite um número válido: ");
                operacao = scan.nextInt();
            }
        }
    }
}
