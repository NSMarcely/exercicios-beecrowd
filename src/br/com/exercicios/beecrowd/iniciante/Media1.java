package br.com.exercicios.beecrowd.iniciante;

import java.util.Scanner;

public class Media1 {
	public static void main(String[] args) {
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
		float a = entrada.nextFloat();
		entrada.nextLine();
		float b = entrada.nextFloat();
		entrada.nextLine();
		double notaA = a*3.5;
		double notaB = b*7.5;
		double resultado = (notaA + notaB)/(3.5+7.5);
		System.out.printf("MEDIA = %.5f%n", resultado);
		entrada.close();
	}
}
