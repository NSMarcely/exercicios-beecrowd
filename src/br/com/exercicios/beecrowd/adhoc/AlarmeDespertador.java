package br.com.exercicios.beecrowd.adhoc;
import java.util.Scanner;

public class AlarmeDespertador {
	static int contarMinutos(int h1, int m1, int h2, int m2) {
		int t1 = (h1 * 60) + m1;
		int t2 = (h2 * 60) + m2;
		int diferencaMinutos = (t1 - t2 + 1440) % 1440;
		int minutosDisponiveis = (1440 - diferencaMinutos);
		return minutosDisponiveis;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		while(true) {
			int h1 = entrada.nextInt();
			int m1 = entrada.nextInt();
			int h2 = entrada.nextInt();
			int m2 = entrada.nextInt();
			if(h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) break;
			System.out.println(AlarmeDespertador.contarMinutos(h1, m1, h2, m2));
			
		}
		entrada.close();
	}
}
