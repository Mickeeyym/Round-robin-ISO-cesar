package Application;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;

import Utilitarios.Processo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int quantum = 2;
		
		Queue<Processo> fila = new LinkedList<Processo>();
		
		Processo p1 = new Processo("P1", 5);
		Processo p2 = new Processo("P2", 7);
		Processo p3 = new Processo("P3", 3);
		
		fila.add(p1);
		fila.add(p2);
		fila.add(p3);
		
		while (!fila.isEmpty()) {
			Processo p = fila.poll();
			
			int tempo = Math.min(quantum, p.getTempoRestante());
			
			p.setTempoRestante(p.getTempoRestante()-tempo);
			
			System.out.println(p.getId() + " executou " + tempo + " unidades (restam " + p.getTempoRestante() + ")");
			
			if (p.getTempoRestante() > 0) {
				fila.add(p);
			}
		}
		
		System.out.println();
		System.out.println("Todos os processos foram concluídos.");
		

	}

}
