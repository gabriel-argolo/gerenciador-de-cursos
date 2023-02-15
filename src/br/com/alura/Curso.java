package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aula = new ArrayList<Aula>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	public String getNome() {
		return nome;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public List<Aula> getAula() {
		return aula;
	}
//	public void setAula(List<Aula> aula) {
//		this.aula = aula;
//	}

}
