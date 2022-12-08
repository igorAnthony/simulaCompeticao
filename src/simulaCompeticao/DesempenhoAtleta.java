package simulaCompeticao;

import java.math.BigDecimal;

public class DesempenhoAtleta {
	private String nomeAtleta;
	private BigDecimal desempenho;
	public String getNomeAtleta() {
		return nomeAtleta;
	}
	public void setDesempenho(BigDecimal desempenho) {
		this.desempenho = desempenho;
	}
	public DesempenhoAtleta(String nome, BigDecimal desempenho) {
		this.nomeAtleta = nome;
		this.desempenho = desempenho;
	}
	public BigDecimal getDesempenho() {
		return desempenho;
	}
}
