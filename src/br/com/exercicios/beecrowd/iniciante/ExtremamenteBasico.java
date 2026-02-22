package br.com.exercicios.beecrowd.iniciante;
import java.util.Scanner;

public class ExtremamenteBasico {
	
	public int somar(int a, int b) {
		int resultado = a + b;
		return resultado;
	}
	public static void main(String[] args) {
		ExtremamenteBasico extremamenteBasico = new ExtremamenteBasico();
		Scanner entrada = new Scanner(System.in);
		//Não colocar no beecrowd
		System.out.println("Número a:");
		int a = entrada.nextInt();
		entrada.nextLine();
		//Não colocar no beecrowd
		System.out.println("Número b:");
		int b = entrada.nextInt();
		entrada.nextLine();
		System.out.println("X = " + extremamenteBasico.somar(a, b));
		entrada.close();
	}
}
