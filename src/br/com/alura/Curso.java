package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aula = new ArrayList<Aula>();
	private int tempoTotal;

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
		return Collections.unmodifiableList(aula);
	}
	public void adicionarAula(Aula a) {
		this.aula.add(a);
	}

	public void getTempoTotal() {
		// TODO Auto-generated method stub
		for (Aula a : aula) {
			tempoTotal += a.getTempo();
		}
		System.out.println("TEMPO TOTAL DE CURSO: "+tempoTotal+"min");
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", instrutor=" + instrutor + ", aula=" + aula + ", tempoTotal=" + tempoTotal
				+ "]";
	}
	
}