package br.com.exercicios.beecrowd.adhoc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopMusical {
	
	static int picosExistentes(Scanner entrada, int n) {
		List<Integer> amostras = new ArrayList<>();
		int picos = 0;
		while(amostras.size() < n) {
			amostras.add(entrada.nextInt());
		}
		for(int p =0; p<n; p++) {
			int anterior = (p - 1 + n) % n;
			int posterior = (p + 1) % n;
			if((amostras.get(anterior) < amostras.get(p)) && (amostras.get(posterior) < amostras.get(p) )) {
				picos++;
			}
			if((amostras.get(anterior) > amostras.get(p)) && (amostras.get(posterior) > amostras.get(p) )) {
				picos++;
			}
		}
		
		return picos;
	}
	
	public static void main(String[] args) {
		System.out.println("hellou");
		Scanner entrada =  new Scanner(System.in);
		while(true) {
			int n = entrada.nextInt();
			entrada.nextLine();
			if(n == 0) break;
			System.out.println(LoopMusical.picosExistentes(entrada, n));
			
		}
		entrada.close();
	}
}
