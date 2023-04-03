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
}