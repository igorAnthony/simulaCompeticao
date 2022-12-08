package simulaCompeticao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class ManipulaArquivoJson {

	Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(LocalDate.class,new LocalDateTypeAdapterAtleta()).create();
	String comp = "";
	ManipulaArquivoJson(int competicao){
		switch(competicao) {
			case 1:
				comp = "ginasta";
				break;
			case 2:
				comp = "natacao";
				break;
			case 3:
				comp = "halterofilismo";
				break;
		}
	}
	public void escreverListaIncricoesNegadas(ListaInscricoesNegadas InscricoesNegadas) {
		try {
			FileWriter writer = new FileWriter("inscricoes-negadas-"+comp+".json");
			
			gson.toJson(InscricoesNegadas, writer);
			//Atleta.quant_atletas += 1;
			writer.close();
		}catch(IOException e) {
			System.out.println("Erro ao gravar arquivo");
		}
	}
	public String escreverResultado(Resultado resultado) {
		try {
			FileWriter writer = new FileWriter("resultado-"+comp+ ".json");
			gson.toJson(resultado, writer);
			//Atleta.quant_atletas += 1;
			return "arquivo " + comp + ".json gerado com sucesso";
			
		}catch(IOException e) {
			System.out.println("Erro ao gravar arquivo");
			throw new ArquivoException("arquivo " + comp + ".json ocorreu erro na hora de gerar");
		}
	}
	public ArrayList<Ginasta> lerArquivoGinastas() {
		ArrayList<Ginasta> listaDeGinastas = null;
		try {
			FileReader reader = new FileReader("ginastas.json");
            // Convert JSON File to Java Object
			listaDeGinastas = gson.fromJson(reader, new TypeToken<ArrayList<Ginasta>>(){}.getType());
			//System.out.println(listaDeGinastas.get(1));
            return listaDeGinastas;

        } catch (FileNotFoundException e) {
           System.out.println("Erro ao ler arquivos");
        }
		return null;
	}
	public ArrayList<Nadador> lerArquivoNadadores() {
		ArrayList<Nadador> listaDeNadadores = new ArrayList<Nadador>();
		try {
			FileReader reader = new FileReader("nadadores.json");
            // Convert JSON File to Java Object
			listaDeNadadores = gson.fromJson(reader, new TypeToken<ArrayList<Nadador>>(){}.getType());

            System.out.println(listaDeNadadores);
            return listaDeNadadores;

        } catch (FileNotFoundException e) {
           System.out.println("Erro ao ler arquivos");
        }
		return null;
	}
	public ArrayList<Halterofilista> lerArquivoHalterofilistas() {
		ArrayList<Halterofilista> listaDeHalterofilistas = new ArrayList<Halterofilista>();
		try {
			FileReader reader = new FileReader("halterofilistas.json");
            // Convert JSON File to Java Object
			listaDeHalterofilistas = gson.fromJson(reader, new TypeToken<ArrayList<Halterofilista>>(){}.getType());

            //System.out.println(listaDeHalterofilistas);
            return listaDeHalterofilistas;

        } catch (FileNotFoundException e) {
           System.out.println("Erro ao ler arquivos");
        }
		return null;
	}
}
