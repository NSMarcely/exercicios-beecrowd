package br.com.exercicios.beecrowd.iniciante;
import java.util.Scanner;

public class Esfera {
	public static void main(String[] args) {
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
		float raio = entrada.nextFloat();
		double volume = (4/3.0) * 3.14159 * (Math.pow(raio, 3));
		System.out.printf("VOLUME = %.3f%n",volume);
		entrada.close();
	}
}
