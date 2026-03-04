package br.com.exercicios.beecrowd.iniciante;
import java.util.Scanner;

public class Diferenca {
	public static void main(String[] args) {
		
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		int diferenca = ((a * b)-(c * d));
		System.out.println("DIFERENCA = " + diferenca);
		entrada.close();
	}
}
