# Exercícios(Desafios de Código) do Bootcamp

## <ul>1°

### Duas motos (X e Y) partem em uma mesma direção. A moto X sai com velocidade constante de 60 Km/h e a moto Y sai com velocidade constante de 90 Km/h.

### Em uma hora (60 minutos) a moto Y consegue se distanciar 30 quilômetros da moto X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

### O seu desafio é ler a distância (em Km) e calcular quanto tempo leva (em minutos) para a moto Y tomar essa distância da outra moto.

## Entrada
### O arquivo de entrada contém um número inteiro K que representa a quantidade de quilômetro que que a moto Y deve estar da moto X.

## Saída
### Imprima o tempo necessário para a moto Y ficar com a quantidade K de quilômetro da moto X, seguido da mensagem " minutos".
<br>

<code>
import java.io.IOException;<br>
import java.util.Scanner;

public class Problem {
	
    public static void main(String[] args) throws IOException {
		//complete os espaços com sua solução
                Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int X, Y;
		
		for (int i = 0; i < N; i++) {
			X = leitor.nextInt();
			Y = leitor.nextInt();
			if (Y == 0) System.out.println("divisao impossivel");
			else System.out.println( ((float)X/Y));
		}
    }	
}
</code>
<hr><br>

## <ul>2°

### Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.
### A seguir escreva o valor desta variável.

## Entrada
### O arquivo de entrada contém 2 valores inteiros.

## Saída
### Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.
<br>

<code>
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
	 	Scanner sc = new Scanner (System.in);
 
		int A, B, soma;
 
 		A = sc.nextInt();
		B = sc.nextInt();
 
 		soma =  A + B;  //insira as variáveis corretamente
 
 		System.out.println("SOMA = " + soma);
 
 		sc.close();

	}
}
</code>
<hr><br>

## <ul>3°

### Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem “divisao impossivel” para os valores em questão.

## Entrada
### A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.

## Saída
### Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.
<br>

<code>
import java.io.IOException;<br>
import java.util.Scanner;

public class Problem {
	
    public static void main(String[] args) throws IOException {
		//complete os espaços com sua solução
                Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int X, Y;
		
		for (int i = 0; i < N; i++) {
			X = leitor.nextInt();
			Y = leitor.nextInt();
			if (Y == 0) System.out.println("divisao impossivel");
			else System.out.println( ((float)X/Y));
		}
    }	
}
</code>
<hr><br>