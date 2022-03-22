package one.digitalinnovation.logica.condicional;

public class Main {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        double d1 = 3.5d;
        double d2 = 4.6d;

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 < i2 " + (i1 < i2));

        //exemplo de operações lógicas com a comparação de valores do tipo "inteiro"

        double salarioMensal = 1200d;
        double mediaSalario = 1300d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        //clean code da expressão acima
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println(salarioBaixo && muitosDependentes);

        //clean code aprimorado
        boolean recebeAuxilio = salarioBaixo && muitosDependentes;

        System.out.println(recebeAuxilio);
    }
}
