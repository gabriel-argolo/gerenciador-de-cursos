package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aula1 = "Trabalhando Com ArrayList";
		String aula2 = "Listas de Objetos";
		String aula3 = "ARelacionamento com Coleções";
		
		List<String> cursos = new ArrayList<>();
		
		cursos.add(aula1);
		cursos.add(aula2);
		cursos.add(aula3);
		
		System.out.println(cursos);

		Collections.sort(cursos);
		
		System.out.println(cursos);
	/*
		cursos.remove(1);
		System.out.println(cursos);
		
		System.out.println("O primeiro curso é: "+cursos.get(0));
	*/
	}

}
