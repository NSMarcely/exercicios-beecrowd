package br.com.exercicios.beecrowd.iniciante;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
	
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
			int numero = entrada.nextInt();
			int recebe = entrada.nextInt();
			float horas = entrada.nextFloat();
			float salario = recebe * horas;
			System.out.println("NUMBER = " + numero);
			System.out.printf("SALARY = U$ %.2f%n", salario);
			entrada.close();
	}
}
