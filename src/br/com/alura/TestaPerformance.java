package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestaPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> numeros = new ArrayList();
		
		long inicio =  System.currentTimeMillis();
//		/*for (int i = 0; i <= 50000; i++) {
//			numeros.add(i);
//		
//		}
		for (int i = 0; i <= 50000; i++) {
			numeros.contains(i);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Tempo Gasto: "+(fim-inicio));
	}
}
