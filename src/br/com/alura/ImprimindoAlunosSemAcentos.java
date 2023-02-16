package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> alunos = new HashSet<>();
		alunos.add("Gabriel");
		alunos.add("Paulo");
		alunos.add("Nico");
		alunos.add("Alberto");
		
		System.out.println(alunos.size());
//		
		alunos.add("Gabriel");
		
		System.out.println(alunos.size());
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		alunos.forEach(aluno ->{
			System.out.println(aluno);
		});
	}

}
