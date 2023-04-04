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
	
	public int retorneMMC(int[] deno, int numeroPrimo) {
		int[] denominadores = new int[3];
		boolean condicao = true;
		int mmc = 1;
		
		denominadores = deno.clone();
		
		while (condicao) {
			if(eDivisivel(denominadores[0], numeroPrimo) && eDivisivel(denominadores[1], numeroPrimo) && eDivisivel(denominadores[2], numeroPrimo)) {
				denominadores[0] = denominadores[0] / numeroPrimo;
				denominadores[1] = denominadores[1] / numeroPrimo;
				denominadores[2] = denominadores[2] / numeroPrimo;
				mmc = mmc * numeroPrimo;
				
			} else if(eDivisivel(denominadores[0], numeroPrimo) && eDivisivel(denominadores[1], numeroPrimo)) {
				denominadores[0] = denominadores[0] / numeroPrimo;
				denominadores[1] = denominadores[1] / numeroPrimo;
				mmc = mmc * numeroPrimo;
				
			} else if(eDivisivel(denominadores[1], numeroPrimo) && eDivisivel(denominadores[2], numeroPrimo)) {
				denominadores[2] = denominadores[2] / numeroPrimo;
				denominadores[1] = denominadores[1] / numeroPrimo;
				mmc = mmc * numeroPrimo;
				
			} else if(eDivisivel(denominadores[0], numeroPrimo) && eDivisivel(denominadores[2], numeroPrimo)) {
				denominadores[0] = denominadores[0] / numeroPrimo;
				denominadores[2] = denominadores[2] / numeroPrimo;
				mmc = mmc * numeroPrimo;
				
			} else {
				int posicao = 0;
				int trocarNumeroPrimo = 0;
				
				while(posicao < 3) {
					if(eDivisivel(denominadores[posicao], numeroPrimo)) {
						denominadores[posicao] = denominadores[posicao] / numeroPrimo;
						trocarNumeroPrimo++;
						
					}
					posicao++;
				}
				
				if(trocarNumeroPrimo == 0) {
					numeroPrimo = proximoPrimo(numeroPrimo);
				} else {
					mmc = mmc * numeroPrimo;
				}
			}
			
			if(denominadores[0] == 1 && denominadores[1] == 1 && denominadores[2] == 1) {
				condicao = false;
			}
			
		}
		return mmc;
	}
}