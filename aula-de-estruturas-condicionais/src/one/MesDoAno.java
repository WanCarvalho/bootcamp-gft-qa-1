package one;

import java.util.Scanner;

public class MesDoAno {

    public String retornaMesDoAno(int A){

        String stringMes = "";

        if (A == 1){
            stringMes = "1 refere-se a Janeiro";
        } else if (A == 2){
            stringMes = "2 refere-se a fevereiro";
        } else if (A == 3){
            stringMes = "3 refere-se a março";
        } else if (A == 4){
            stringMes = "4 refere-se a abril";
        } else if (A == 5){
            stringMes = "5 refere-se a maio";
        } else if (A == 6){
            stringMes = "6 refere-se a junho";
        } else if (A == 7){
            stringMes = "7 refere-se a julho";
        } else if (A == 8){
            stringMes = "8 refere-se a agosto";
        } else if (A == 9){
            stringMes = "9 refere-se a setembro";
        } else if (A == 10){
            stringMes = "10 refere-se a outubro";
        } else if (A == 11){
            stringMes = "11 refere-se a novembro";
        } else if (A == 12){
            stringMes = "12 refere-se a dezembro";
        } else {
            stringMes = "Você digitou um número inválido. Digite novamente: ";
            //implementar aqui para voltar para o user digitar outro número

        }
        return stringMes;
    }
}
