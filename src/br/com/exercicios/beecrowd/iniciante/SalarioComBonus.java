package br.com.exercicios.beecrowd.iniciante;

import java.util.Scanner;

public class SalarioComBonus {
	public static void main(String[] args) {
		
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		float fixo = entrada.nextFloat();
		float vendas = entrada.nextFloat();
		double salario = fixo + (vendas * 0.15);
		System.out.printf("TOTAL = R$ %.2f%n", salario);
		entrada.close();
	}
}
