package br.com.exercicios.beecrowd.iniciante;
import java.util.Scanner;

public class SomaSimples {
	public static void main(String[] args) {
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
		entrada.nextLine();
		int b = entrada.nextInt();
		entrada.nextLine();
		int soma = a + b;
		System.out.println("SOMA = " + soma);
		entrada.close();
	}
}
