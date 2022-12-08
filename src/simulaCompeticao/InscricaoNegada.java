package simulaCompeticao;

public class InscricaoNegada {
	private String nomeAtleta;
	private String motivo;
	public InscricaoNegada(String nomeAtleta, String motivo){
		this.nomeAtleta = nomeAtleta;
		this.motivo = motivo;
	}
	@Override
	public String toString() {
		return "nomeAtleta=" + nomeAtleta + ", motivo=" + motivo;
	}
}
