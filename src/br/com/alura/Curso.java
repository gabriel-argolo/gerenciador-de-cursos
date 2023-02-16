package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aula = new ArrayList<Aula>();
	private Set<Aluno> aluno = new HashSet<>();
	private int tempoTotal;

	public Curso(String nome, String instrutor) {
		super();
		if(nome==null) {
			throw new NullPointerException("Insira um valor Diferente de Nulo");
		}
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

	public void matricula(Aluno a) {
		this.aluno.add(a);
	}

	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(aluno);
	}
	
	public boolean estaMatriculado(Aluno aluno){
		return this.aluno.contains(aluno);
	}
	
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Aluno outroAluno = (Aluno) obj;
//		return this.nome.equals(outroAluno.getNome());
//	}
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", instrutor=" + instrutor + ", aula=" + aula + ", tempoTotal=" + tempoTotal
				+ "]";
	}
	

}