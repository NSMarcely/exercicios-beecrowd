package br.com.exercicios.beecrowd.iniciante;

import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
		float a = entrada.nextFloat();
		entrada.nextLine();
		float b = entrada.nextFloat();
		entrada.nextLine();
		float c = entrada.nextFloat();
		entrada.nextLine();
		double notaA = a * 2;
		double notaB = b * 3;
		double notaC = c * 5;
		double resultado = (notaA + notaB + notaC)/(2 + 3 + 5);
		System.out.printf("MEDIA = %.1f%n", resultado);
		entrada.close();
	}
}

