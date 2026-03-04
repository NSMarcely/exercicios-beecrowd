package br.com.exercicios.beecrowd.iniciante;
import java.util.Scanner;

public class CalculoSimples {
	public static void main(String[] args) {
		
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
		int contador = 1;
		double pagar = 0;
		while(contador <=2) {
			int codigo = entrada.nextInt();
			int quantidade = entrada.nextInt();
			float preco = entrada.nextFloat();
			pagar += (quantidade * preco);
			contador++;
		}
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", pagar);
		entrada.close();
	}
}
