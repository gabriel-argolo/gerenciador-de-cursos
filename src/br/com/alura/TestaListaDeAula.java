package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaListaDeAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aula a1 = new Aula("Estrutura de Dados", 36);
		Aula a2 = new Aula("Programacao Orientada a Objetos", 5);
		Aula a3 = new Aula("Analise de Algoritmo", 16);
		
		List<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
	
		aulas.sort(null);
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));		
		System.out.println(aulas);
	}
}
