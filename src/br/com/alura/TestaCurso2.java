package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

//import java.util.ArrayList;
//import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso = new Curso("Java Collections", "Paulo Silveira");
		curso.adicionarAula(new Aula("Trabalhando com Vector", 21));
		curso.adicionarAula(new Aula("Trabalhando com LinkedList", 47));
		curso.adicionarAula(new Aula("Trabalhando com ArrayList", 16));

		ArrayList<Aula> aulasImutaveis = new ArrayList<>(curso.getAula());
		System.out.println(aulasImutaveis);
		Collections.sort(aulasImutaveis);
		System.out.println(aulasImutaveis);

		curso.getTempoTotal();

		System.out.println(curso);
	}
}
