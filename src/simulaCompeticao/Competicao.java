package simulaCompeticao;

import java.time.LocalDate;
import java.util.ArrayList;

public class Competicao {
	private ArrayList atletasInscritos = null;
	ManipulaArquivoJson mA;
	Competicao(int competicao){
		this.mA = new ManipulaArquivoJson(competicao);
	}
	public ArrayList<Atleta> getAtletasInscritos() {
		return atletasInscritos;
	}
	public void registrar(int competicao) 
	{
		switch(competicao) {
			case 1:
				retornaInscritosGinasta(mA.lerArquivoGinastas());
				break;
			case 2:
				retornaInscritosNadadores(mA.lerArquivoNadadores());
				break;
			case 3:
				retornaInscritosHalterofilista(mA.lerArquivoHalterofilistas());
				break;
			default:
				break;
			
		}
		
	}
	private void retornaInscritosGinasta(ArrayList<Ginasta> PossiveisAtletasGinasta){
		Ginasta ginasta = new Ginasta();
		this.atletasInscritos = new ArrayList<Ginasta>();
		ListaInscricoesNegadas inscricoesNegadaGinasta = new ListaInscricoesNegadas();
		String motivo = "";
		System.out.println("data:" + PossiveisAtletasGinasta.get(0).getDataNascimento());
		for(int i = 0; i < PossiveisAtletasGinasta.size(); i++) {
			ginasta = PossiveisAtletasGinasta.get(i);
			motivo = "";
			if((LocalDate.now().getYear() - ginasta.getDataNascimento().getYear()) < 18) {
				motivo = "Atleta menor de idade";
				System.out.println(new IdadeException("Atleta menor de idade"));
			}
			else if((LocalDate.now().getYear() - ginasta.getDataNascimento().getYear())>45) {
				motivo = "Idade do atleta superior ao permitido";
				System.out.println(new IdadeException("Idade do atleta superior ao permitido"));
			}
			else if(ginasta.getNumeroLesoes() > 10) {
				motivo = "Atleta com excesso de lesões";
				System.out.println(new ExcessoLesoesException("Atleta com excesso de lesões"));
			}
			
			if(motivo != "") {
				InscricaoNegada inscricaoNegada = new InscricaoNegada(ginasta.getNome(),motivo);
				inscricoesNegadaGinasta.setInscricaoNegada(inscricaoNegada);
			}else {
				this.atletasInscritos.add(ginasta);
			}
		}
		mA.escreverListaIncricoesNegadas(inscricoesNegadaGinasta);
	}
	private void retornaInscritosNadadores(ArrayList<Nadador> PossiveisAtletasNadadores){
		Nadador nadador = new Nadador();
		this.atletasInscritos = new ArrayList<Nadador>();
		ListaInscricoesNegadas inscricoesNegadaNadador = new ListaInscricoesNegadas();
		String motivo = "";
		for(int i = 0; i < PossiveisAtletasNadadores.size(); i++) {
			nadador = PossiveisAtletasNadadores.get(i);
			motivo = "";
			if((LocalDate.now().getYear() - nadador.getDataNascimento().getYear()) < 18) {
				motivo = "Atleta menor de idade";
				System.out.println(new IdadeException("Atleta menor de idade"));
			}
			else if((LocalDate.now().getYear() - nadador.getDataNascimento().getYear())>45) {
				motivo = "Idade do atleta superior ao permitido";
				System.out.println(new IdadeException("Idade do atleta superior ao permitido"));
			}
			else if(nadador.getNumeroLesoes() > 10) {
				motivo = "Atleta com excesso de lesões";
				System.out.println(new ExcessoLesoesException("Atleta com excesso de lesões"));
			}
			if(motivo != "") {
				InscricaoNegada inscricaoNegada = new InscricaoNegada(nadador.getNome(),motivo);
				inscricoesNegadaNadador.setInscricaoNegada(inscricaoNegada);
			}else {
				this.atletasInscritos.add(nadador);
			}
		}
		mA.escreverListaIncricoesNegadas(inscricoesNegadaNadador);
	}
	private void retornaInscritosHalterofilista(ArrayList<Halterofilista> PossiveisAtletasHalterofilistas){
		Halterofilista halterofilista = new Halterofilista();
		atletasInscritos = new ArrayList<Halterofilista>();
		ListaInscricoesNegadas inscricoesNegadaHalterofilista = new ListaInscricoesNegadas();
		String motivo = "";
		for(int i = 0; i < PossiveisAtletasHalterofilistas.size(); i++) {
			motivo = "";
			halterofilista = PossiveisAtletasHalterofilistas.get(i);
			if((LocalDate.now().getYear() - halterofilista.getDataNascimento().getYear()) < 18) {
				motivo = "Atleta menor de idade";
				System.out.println(new IdadeException("Atleta menor de idade"));
			}
			else if((LocalDate.now().getYear() - halterofilista.getDataNascimento().getYear())>45) {
				motivo = "Idade do atleta superior ao permitido";
				System.out.println(new IdadeException("Idade do atleta superior ao permitido"));
			}
			else if(halterofilista.getNumeroLesoes() > 10) {
				motivo = "Atleta com excesso de lesões";
				System.out.println(new ExcessoLesoesException("Atleta com excesso de lesões"));
			}
			if(motivo != "") {
				InscricaoNegada inscricaoNegada = new InscricaoNegada(halterofilista.getNome(),motivo);
				inscricoesNegadaHalterofilista.setInscricaoNegada(inscricaoNegada);
			}else {
				this.atletasInscritos.add(halterofilista);
			}
		}
		mA.escreverListaIncricoesNegadas(inscricoesNegadaHalterofilista);
	}
}
