package br.com.alura;

//import java.util.ArrayList;
//import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso = new Curso("Java Collections", "Paulo Silveira");
		//Aula aula = new Aula("Criando Relacionamentos com Colecoes", 24);
		//List<Aula> lista = new ArrayList<>();
		//lista.add(aula);
		//curso.setAula(lista);
		curso.getAula().add(new Aula("Trabalhando com ArrayList", 21));
		System.out.println(curso.getNome());
		System.out.println(curso.getAula());
	}
}
