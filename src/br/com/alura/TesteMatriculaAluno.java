package br.com.alura;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class TesteMatriculaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso javaColecoes = new Curso("Dominando as colecoes do Java",
				"Paulo Silveira");
		javaColecoes.adicionarAula(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionarAula(new Aula("Criando uma Aula", 20));
		javaColecoes.adicionarAula(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno("Gabriel", 123);
		Aluno a2 = new Aluno("Pedro", 1010);
		Aluno a3 = new Aluno("Vivian", 1100);
		Aluno a4 = new Aluno("Alissa", 355);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.getAlunos());
		
//	    Set<Aluno> alunos = javaColecoes.getAlunos();
//	    alunos.add(a4);
//		
//		Set<String> nomes = Collections.emptySet();
//		nomes.add("Gabriel");
//		System.out.println(nomes);
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		letras.add("D");
		
	
		
	}

}
