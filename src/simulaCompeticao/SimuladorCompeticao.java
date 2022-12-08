package simulaCompeticao;

import javax.swing.JOptionPane;

public class SimuladorCompeticao {
	
	public SimuladorCompeticao(int competicao) {
		Competicao comp = new Competicao(competicao);
		comp.registrar(competicao);
		ManipulaArquivoJson mA = new ManipulaArquivoJson(competicao);
		System.out.println(comp.getAtletasInscritos());
		Resultado result = new Resultado(comp.getAtletasInscritos(),competicao);
		JOptionPane.showMessageDialog(null, mA.escreverResultado(result));	
	}
}
