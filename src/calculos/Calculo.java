package calculos;

public class Calculo {
	
	public boolean ePrimo(int numero) {
		boolean resposta = false;
		int contar = 0;
		int indice = 2;
		
		while(indice <= numero && contar != 2) {
			if(numero % indice == 0) {
				contar++;
			}
			indice++;
		}
		
		if(contar == 1) {
			resposta = true;
		}
		
		return resposta;
	}
	
	public int proximoPrimo(int primo) {
		primo++;
		
		while(!ePrimo(primo)) {
			primo++;
		}
		return primo;
	}
	
	public boolean eDivisivel(int denominador, int primo) {
		boolean resposta = false;
		
		if(denominador % primo == 0) {
			resposta = true;
		}
		
		return resposta;
	}
	
	public void fazerMMC(int[] denominadores, int numeroPrimo) {
		while (denominadores[0] != 1 && denominadores[1] != 1 && denominadores[2] != 1) {
			if(denominadores[0] % numeroPrimo == 0 && denominadores[1] % numeroPrimo == 0) {}
		}
	}
}