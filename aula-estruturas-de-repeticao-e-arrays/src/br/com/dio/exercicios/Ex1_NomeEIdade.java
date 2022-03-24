package br.com.dio.exercicios;

/*Faça um programa que leia conjunto de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo 0 no campo nome)*/

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        while(true){
            System.out.print("Insira o nome do aluno: ");
            nome = scan.next();

            //condição "if" que para o código caso o nome inserido seja igual a 0 (Utilizado o método equals() para equiparar)
            if (nome.equals("0")) break;

            System.out.print("Digite a idade do aluno: ");
            idade = scan.nextInt();
        }
    }
}
