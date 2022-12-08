package simulaCompeticao;

import java.util.ArrayList;

public class ListaInscricoesNegadas {
	private int nr_participantes;
	ArrayList<InscricaoNegada> inscricaoNegada;
	ListaInscricoesNegadas(){
		inscricaoNegada = new ArrayList<InscricaoNegada>();
		nr_participantes = 0;
	}
	public void setInscricaoNegada(InscricaoNegada inscricaoNegada) {
		this.inscricaoNegada.add(inscricaoNegada);
		this.nr_participantes+=1;
	}
	
}
