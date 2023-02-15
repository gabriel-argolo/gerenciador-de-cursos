package br.com.alura;

//import java.util.ArrayList;
//import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adicionarAula(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adicionarAula(new Aula("Criando uma Aula", 20));
        javaColecoes.adicionarAula(new Aula("Modelando com colecoes", 24));

        System.out.println(javaColecoes.getAula());
	}
}
