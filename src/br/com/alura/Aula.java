package br.com.alura;

public class Aula implements Comparable<Aula> {
	private String nome;
	private int tempo;
	public Aula(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}
	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titulo: " +this.nome +" Tempo: " +this.tempo +"min";
	}

	@Override
	public int compareTo(Aula outra) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(outra.nome);
	}
}
