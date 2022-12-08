package simulaCompeticao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimuladorCompeticao simula = new SimuladorCompeticao(Integer.parseInt(JOptionPane.showInputDialog("Escolha a competição que deseja simular:\n1 - Ginasta\n2 - Natação\n3 - Halterofilista")));
	}

}
