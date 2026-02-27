package br.com.exercicios.beecrowd.iniciante;

import java.util.Scanner;

public class ProdutoSimples {
	public static void main(String[] args) {
		
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
		entrada.nextLine();
		int b = entrada.nextInt();
		entrada.nextLine();
		int resultado = a * b;
		System.out.println("PROD = " + resultado);
		entrada.close();
		
	}
}
