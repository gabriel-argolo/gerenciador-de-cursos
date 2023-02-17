package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> pessoas = new HashMap<>();
		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");

		System.out.println(pessoas.keySet());
//		ArrayList<Integer> chaves = new ArrayList<>();
//		chaves.addAll(pessoas.keySet());
//		for (int i = 0; i < chaves.size(); i++) {
//			System.out.println(pessoas.get(chaves.get(i)));
//		}
		Set<Integer> chaves = pessoas.keySet();
		for (Integer idade : chaves) {
			System.out.println(idade);
		}
		Collection<String> valores = pessoas.values();
		for (String nomes : valores) {
			System.out.println(nomes);
		}
		Set<Entry<Integer, String>> assoc = pessoas.entrySet();
		for (Entry<Integer, String> entry : assoc) {
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
	}
}
