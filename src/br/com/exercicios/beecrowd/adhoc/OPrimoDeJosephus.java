package br.com.exercicios.beecrowd.adhoc;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class OPrimoDeJosephus {
	
	public static boolean primo(int numero) {
		if(numero <=1) return false;
		
			for(int i = 2; i*i<=numero; i++ ) {
				if(numero % i == 0) return false;	
			}
			
			return true;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		while(true) {
			int pessoas = entrada.nextInt();
			if(pessoas == 0)break; 
			List<Integer> vivos = new ArrayList<>();
			int posicao = 0;
			int m = 2;
			for(int n= 1; n<= pessoas; n++) {
				vivos.add(n);
			}
			while(vivos.size()>1) {
				if(OPrimoDeJosephus.primo(m)) {
					posicao = (posicao + m - 1)% vivos.size();
					vivos.remove(posicao);
				}
				m++;
			}
			System.out.println(vivos.get(0));
		}
		entrada.close();
	}
}
