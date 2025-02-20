package Capitulo2;

public class atividade2_cap2 {
	public static void main(String args[]) {
		float tamanhoDaPista = 0, pesoDoAviao;
		int visibilidade=0, intensidadeDaChuva=0, numeroDePassageiros=0;
		boolean possuiSistemaDeDecolagem = false, decola;
		
		if(tamanhoDaPista < 1.5) {
			pesoDoAviao = 40;
		}else if(tamanhoDaPista > 1.5 && tamanhoDaPista < 2.0) {
			pesoDoAviao = 60;
		}else if(tamanhoDaPista > 2.0) {
			decola = true;
		}
		
		if(visibilidade < 20 && possuiSistemaDeDecolagem == true) {
			decola = true;
		}else if(intensidadeDaChuva > 5) {
			decola = false;
		}
		if(numeroDePassageiros > 100 && intensidadeDaChuva >= 1) {
			decola = false;
		}
		
		
		//se a pista for menor que 1,5km o aviao DEVE pesar menos de 40toneladas
		//caso a pista possua entre 1,5km e 2,0km o aviao NAO PODE TER mais de 60 toneladas
		//caso a pista seja maior que 2km qualquer aviao pode decolar
		
		//se a visibilidade for inferior a 20 metros, apenas avioes com piloto automatico podem decolar
		//se estiver chovendo acima de 5mm nenhum aviao pode sair
		
		//se o aviao possuir mais de 100 passageiros E estiver chovendo, independente da intensidade, o aviao nao pode sair
		//
	}
} 



