package lista_Exercicios_4;

import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		int n = scr.nextInt();
		
		int in = 0;
		int out = 0;
		
		
		for(int i=0; i<n; i++) {
			int x = scr.nextInt();
			
			if(x >=10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}			
		}
		
		System.out.println("in: "+in);
		System.out.println("out: "+out);
			
		scr.close();
	}

}
