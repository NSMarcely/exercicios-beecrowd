package br.com.exercicios.beecrowd.adhoc;
import java.util.Scanner;
import java.lang.StringBuilder;

public class CarregaOuNaoCarrega {
	//Utilizar static para não precisar instânciar a classe CarregaOuNaoCarrega
	public static long utilizandoXOR(long a, long b) {
		long resultado = a ^ b;
		return resultado;
	}
	
	public static long semXOR(long a, long b) {
		String c = Long.toBinaryString(a);
		String d = Long.toBinaryString(b);
		String r1  =  String.format("%32s", c).replace(" ", "0");
		String r2  =  String.format("%32s",  d).replace(" ", "0");
		StringBuilder resultado = new StringBuilder();
		for(int i= 0; i<=31; i++) {
			if(r1.charAt(i) == r2.charAt(i)) {
				resultado.append(0);
			}
			else{
				resultado.append(1);
			}
		}
		long resultadoFinal = Long.parseLong(resultado.toString(), 2);
		return resultadoFinal;
	}
	
	public static void main(String[] args) {
		
		//Não colocar no Beecrowd
		System.out.println("Iniciou!");
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			
			try {
				long a = entrada.nextLong();
				long b = entrada.nextLong();
				entrada.nextLine();
				
				long resultado = CarregaOuNaoCarrega.utilizandoXOR(a, b);
				long resultado2 = CarregaOuNaoCarrega.semXOR(a, b);
				
				//Para rodar o Beecrowd deixe apenas o resultado e escoçlha a penas um dos métodos
				System.out.println("Resultado com o XOR: " + resultado);
				System.out.println("Resultado sem o XOR: " + resultado2);
			}
			catch (Exception e) {
				break;
			}
		}
		entrada.close();
	}
}
