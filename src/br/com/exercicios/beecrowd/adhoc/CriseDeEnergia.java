package br.com.exercicios.beecrowd.adhoc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriseDeEnergia {
	public static void main(String[] args) {
		
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			int n = entrada.nextInt();
			if(n == 0) break;
			
			for(int m = 1; ; m++ ) {
				 List<Integer> ligados = new ArrayList<>();
				 for(int i =1; i<=n; i++) {
					 ligados.add(i);
				 }
				 
				 int posicao = 0;
				 ligados.remove(posicao);
				 
				 while(ligados.size()>1) {
					 posicao = (posicao + (m-1))%ligados.size();
					 ligados.remove(posicao);
				 }
				 
				 if(ligados.get(0)==13) {
					 System.out.println(m);
					 break;
				 }
			}
		}
		entrada.close();
	}
}
