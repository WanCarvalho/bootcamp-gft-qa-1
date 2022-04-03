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

![Exemplos de Entrada/Saída](/Exemplos-img/Ex1%231desafio.png)

~~~
import java.util.Scanner;
 
public class Test {
 
    public static void main(String[] args) {
          
        int distancia;
        Scanner input = new Scanner(System.in);
        distancia = input.nextInt();
        int K = distancia*2;

        System.out.printf("%d minutos\n",K); // Digite aqui o calculo dos minutos
    }  
}
~~~
<br>
<hr><br>

## <ul>2°

### Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.
### A seguir escreva o valor desta variável.

## Entrada
### O arquivo de entrada contém 2 valores inteiros.

## Saída
### Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.
<br>

![Exemplos de Entrada/Saída](/Exemplos-img/Ex2%231desafio.png)

~~~
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
	 	Scanner sc = new Scanner (System.in);
 
		int A, B, soma;
 
 		A = sc.nextInt();
		B = sc.nextInt();
 
 		soma =  A + B; 
 
 		System.out.println("SOMA = " + soma);
 
 		sc.close();

	}
}
~~~
<br>
<hr><br>

## <ul>3°

### Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem “divisao impossivel” para os valores em questão.

## Entrada
### A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.

## Saída
### Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.
<br>

![Exemplos de Entrada/Saída](/Exemplos-img/Ex3%231desafio.png)

~~~
import java.io.IOException;<br>
import java.util.Scanner;

public class Problem {
	
    public static void main(String[] args) throws IOException {
		
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
~~~
<br>
<hr><br>

## <ul>4°

### Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse um programa para verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos de A.

## Entrada
### A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste consiste de dois inteiros A (1 ≤ A < 231 ) e B (1 ≤ B < 231) positivos.

## Saída
### Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor, confome exemplo abaixo.
<br>

![Exemplos de Entrada/Saída](/Exemplos-img/Ex4%231desafio.png)

~~~
import java.util.Scanner;<br>
public class Problem {<br>

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		 
		for (int i = 0; i < count; i++) {
		
      		int A = scan.nextInt();
      		int B = scan.nextInt();
      		String tamA = ""+A;
      		String tamB = ""+B;
      
			if (tamA.endsWith(""+tamB) == true){
				System.out.println("encaixa");
			} 
			else System.out.println("nao encaixa");
		}
	}
}
~~~
<br>
<hr><br>

## <ul>5°

### Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

## Entrada
### A entrada contém valores inteiros.

## Saída
### A saída deve conter uma das mensagens conforme descrito acima.
<br>

![Exemplos de Entrada/Saída](/Exemplos-img/Ex5%231desafio.png)

~~~
import java.io.IOException;
import java.util.Scanner;

public class Classe{
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int A = leitor.nextInt();
        int B = leitor.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
    
}
~~~
<br>
<hr><br>

## <ul>6°

### Tento como base a hora inicial e final de um jogo, calcule a duração do dele, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de, 60 minutos e máxima de 24 horas.

## Entrada
### A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

## Saída
### Apresente a duração do jogo conforme exemplo abaixo.
<br>

![Exemplos de Entrada/Saída](/Exemplos-img/Ex6%231desafio.png)

~~~
import java.util.Scanner;

public class Problem {
	public static void main(String[] args){          

        Scanner scan = new Scanner(System.in);

		int inicio, fim, horas;
		inicio = scan.nextInt();
		fim = scan.nextInt();
		horas = fim - inicio;

		if(horas == 0){
			System.out.print("O JOGO DUROU 24 HORA(S)\n");
		}else if((horas) < 24 && horas < 0){
			System.out.print("O JOGO DUROU " + (horas+24) + " HORA(S)\n");
		}else if(horas >  24){
			System.out.print("O JOGO DUROU " + (horas) + " HORA(S)\n");
		}else{
			System.out.print("O JOGO DUROU " +  (horas)  + " HORA(S)\n");
		}		
	}
}
~~~
<br>
<hr><br>