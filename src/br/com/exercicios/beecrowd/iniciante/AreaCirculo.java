package br.com.exercicios.beecrowd.iniciante;
import java.util.Scanner;

public class AreaCirculo {
	double n = 3.14159;
	
	public double calcular(double raio) {
		double a = Math.pow(raio, 2);
		double b = this.n;
		double area = b * a;
		return area;
	}
	
	public static void main(String[] args) {
		AreaCirculo areaCirculo = new AreaCirculo();
		Scanner entrada = new Scanner(System.in);
		System.out.println("raio:");
		double raio = entrada.nextDouble();
		System.out.printf("A=%.4f%n"+ areaCirculo.calcular(raio));
		entrada.close();
	}
}
