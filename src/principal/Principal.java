package principal;

import java.util.Scanner;

import calculos.Calculo;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] numerador = new int[3];
		int[] denominador = new int [3];
		int numeroPrimo = 2;
		int mmc = 0;
		int posicao = 0;
		int somaNumerador = 0;
		
		System.out.println("Programa soma de fraçoes com denominadores diferentes.\n");
		
		for(int i=0; i <3; i++) {
			System.out.printf("Informe o %d numerador: ", i + 1);
			numerador[i] = entrada.nextInt();
			System.out.printf("Informe o %d denominador: ", i + 1);
			denominador[i] = entrada.nextInt();
		}
		
		entrada.close();
		
		Calculo calculo = new Calculo();
		
		System.out.println("Frações informadas:\n");
		System.out.println(numerador[0] + "/" + denominador[0] + "+" + numerador[1] + "/" + denominador[1] + "+" + numerador[2] + "/" + denominador[2]);
		
		mmc = calculo.retorneMMC(denominador, numeroPrimo);
		
		System.out.println("O MMC dos denominadores: " + mmc);
		
		while(posicao < 3) {
			denominador[posicao] = mmc / denominador[posicao];
			numerador[posicao] = numerador[posicao] * denominador[posicao];
			posicao++;
		}
		
		System.out.println("==> " + numerador[0] + "/" + denominador[0] + "+" + numerador[1] + "/" + denominador[1] + "+" + numerador[2] + "/" + denominador[2]);
		
		System.out.println("==> " + numerador[0] + "/" + mmc + "+" + numerador[1] + "/" + mmc + "+" + numerador[2] + "/" + mmc);
		
		posicao = 0;
		
		while(posicao < 3) {
			somaNumerador += numerador[posicao];
			posicao++;
		}
		
		System.out.println("\nResultado => " + somaNumerador + "/" + mmc);
	}

}
