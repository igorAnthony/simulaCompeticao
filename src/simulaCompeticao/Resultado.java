package simulaCompeticao;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Resultado {
	private String nomeAtletaCampeao = "";
	private int numero_participantes = 0;
	private ArrayList<DesempenhoAtleta> desempenhos = new ArrayList<DesempenhoAtleta>();

	public Resultado(ArrayList<Atleta> listaInscritos, int competicao) 
	{
		this.numero_participantes = listaInscritos.size();
		BigDecimal maior_desempenho = new BigDecimal("0");
		for(int i = 0; i < listaInscritos.size();i++) {
			DesempenhoAtleta dA = new DesempenhoAtleta(listaInscritos.get(i).getNome(), chamaFormula(listaInscritos.get(i),competicao));
			if(maior_desempenho.compareTo(dA.getDesempenho()) == -1) {
				maior_desempenho = dA.getDesempenho();
				nomeAtletaCampeao = dA.getNomeAtleta();
			}
			desempenhos.add(dA);
		}
		
	}
	public BigDecimal calculoFormula(Atleta atleta, 
									 BigDecimal coeficienteForca, 
									 BigDecimal coeficienteResistencia, 
									 BigDecimal coeficienteFolego,
									 BigDecimal coeficienteFlexibilidade) 
	{	
		BigDecimal d = new BigDecimal("1");
		BigDecimal nrLesoes = new BigDecimal(atleta.getNumeroLesoes());
		d = d.add(atleta.getForca().multiply(coeficienteForca));
		d = d.add(atleta.getResistencia().multiply(coeficienteResistencia));
		d = d.add(atleta.getFolego().multiply(coeficienteFolego));
		d = d.add(atleta.getFlexibilidade().multiply(coeficienteFlexibilidade));
		d = d.subtract(atleta.getPeso().divide(new BigDecimal("100")));
		d = d.subtract(nrLesoes.divide(new BigDecimal("10")));
		return d;
	}
	public BigDecimal chamaFormula(Atleta atleta, int competicao)
	{
		switch (competicao) {
			case 1:
				return calculoFormula(atleta,
									  new BigDecimal("0.6"), 
									  new BigDecimal("0.6"), 
									  new BigDecimal("0.5"), 
									  new BigDecimal("1"));
			case 2:
				return calculoFormula(atleta,
									  new BigDecimal("0.5"), 
									  new BigDecimal("0.6"), 
									  new BigDecimal("1"), 
									  new BigDecimal("0.3"));
			case 3:
				return calculoFormula(atleta,
									  new BigDecimal("1"), 
									  new BigDecimal("0.6"), 
									  new BigDecimal("0.4"), 
									  new BigDecimal("0.3"));
			default:
				return null;
		}
	}
}
