package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteStringJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s = new ArrayList<>();
		s.add("Casa do Codigp");
		s.add("Alura Online");
		s.add("Caelum");


		class ImprimeNaLinha implements Consumer<String>{
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		}

		Consumer<String> consumidor = new ImprimeNaLinha();
		s.forEach(consumidor);

		System.out.println();
		s.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));

		for (String palavra : s) {
			System.out.println(palavra);
		}

		Runnable r = ()->System.out.println("Rodando uma thread");
		Thread t = new Thread(r);
		t.start();
	}
}