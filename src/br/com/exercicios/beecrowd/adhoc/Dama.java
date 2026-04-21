package br.com.exercicios.beecrowd.adhoc;
import java.util.Scanner;

public class Dama {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			
			if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break;
			
			else if (x1 == x2 && y1 == y2) {
				System.out.println(0);
			}
			
			else if((x1 == x2 || y1 == y2) || (Math.abs(x1 - x2) == Math.abs(x2 + y2))) {
				System.out.println(1);
			}
			
			else if(x1 != x2 && y1 != y2) {
				System.out.println(2);
			}
			
		}
		input.close();
	}
}
