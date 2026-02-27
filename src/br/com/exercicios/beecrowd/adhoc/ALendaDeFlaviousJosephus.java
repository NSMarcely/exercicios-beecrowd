package br.com.exercicios.beecrowd.adhoc;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ALendaDeFlaviousJosephus {
	
	public static int quemVive(int n, int k) {
		List<Integer> vivos = new ArrayList<>();
		for(int i = 1; i<=n; i++) {
			vivos.add(i);
		}
		
		int posicao = 0; 
		
		while(vivos.size() > 1) {
			posicao = (posicao + (k-1))%vivos.size();
			vivos.remove(posicao);
		}
		return vivos.get(0);
	}
	
	public static void main(String[] args) {
	
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
		int cn = entrada.nextInt();
		
		for(int i = 1; i <= cn; i++) {
				int n = entrada.nextInt();
				int k = entrada.nextInt();
				entrada.nextLine();
				System.out.println("Case " + i + ": " + quemVive(n, k));
			}
		entrada.close();
		}
}
