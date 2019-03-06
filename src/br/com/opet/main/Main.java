package br.com.opet.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import com.opet.util.Reader;

public class Main {

	public static void main(String[] args) throws Exception {

		Random rdn = new Random();

		HashMap Lista = new HashMap();
		int contagemIteracoes = 0;
		while (Lista.size() < 100) {
			Lista.put(rdn.nextInt(200),contagemIteracoes);
			contagemIteracoes++;
		}
		
		System.out.println("Informe um número de 0 a 199");
		int leia = Reader.readInt();
		
		if(Lista.containsValue(leia)) {
			System.out.println("Possui o numero informado");
			System.out.println("Houveram " + Lista.get(leia) + " itaracoes para obte-lo");
		}else if(leia > 200){
			System.out.println("Informe um numero dentro do Range de 0 a 200");
		}else {
			System.out.println("Nao possui o numero informado");
		}

	}

}
