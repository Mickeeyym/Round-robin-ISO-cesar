package ExemploFilaPrioridade;

import java.util.Locale;
import java.util.PriorityQueue;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		PriorityQueue<Integer> filaPrioridade = new PriorityQueue<Integer>();
		
		filaPrioridade.add(5);
		filaPrioridade.add(1);
		filaPrioridade.add(3);
		
		while (!filaPrioridade.isEmpty()) {
			
			System.out.println("Removendo " + filaPrioridade.poll());
		}

	}

}
