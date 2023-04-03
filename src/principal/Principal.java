package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] numerador = new int[3];
		int[] denominador = new int [3];
		
		System.out.println("Informe 3 frações para fazer a redução de denominador comum.\n");
		
		for(int i=0; i <3; i++) {
			System.out.printf("Informe o %d numerador: ", i + 1);
			numerador[i] = entrada.nextInt();
			System.out.printf("Informe o %d denominador: ", i + 1);
			denominador[i] = entrada.nextInt();
		}
		
		entrada.close();
	}

}
