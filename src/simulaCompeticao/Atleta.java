package simulaCompeticao;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public abstract class Atleta {
	private String nome;
	private LocalDate dataNascimento;
	private BigDecimal peso;
	private BigDecimal resistencia;
	private BigDecimal flexibilidade;
	private BigDecimal folego;
	private BigDecimal forca;
	private int numeroLesoes = 0;
	


	@Override
	public String toString() {
		return "nome=" + nome + ", dataNascimento=" + dataNascimento + ", peso=" + peso + ", flexibilidade="
				+ flexibilidade + ", folego=" + folego + ", forca=" + forca + ", numeroLesoes=" + numeroLesoes + "\n";
	}
	

	public String getNome() {
		return nome;
	}


	public String competir() {
		return "";
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public BigDecimal getPeso() {
		return peso;
	}


	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}


	public BigDecimal getResistencia() {
		return resistencia;
	}


	public void setResistencia(BigDecimal resistencia) {
		this.resistencia = resistencia;
	}


	public BigDecimal getFlexibilidade() {
		return flexibilidade;
	}


	public void setFlexibilidade(BigDecimal flexibilidade) {
		this.flexibilidade = flexibilidade;
	}


	public BigDecimal getFolego() {
		return folego;
	}


	public void setFolego(BigDecimal folego) {
		this.folego = folego;
	}


	public BigDecimal getForca() {
		return forca;
	}


	public void setForca(BigDecimal forca) {
		this.forca = forca;
	}


	public int getNumeroLesoes() {
		return numeroLesoes;
	}


	public void setNumeroLesoes(int numeroLesoes) {
		this.numeroLesoes = numeroLesoes;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
}
