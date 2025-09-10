package Utilitarios;

public class Processo {
	
	private  String id;
	private int tempoRestante;
	
	public Processo(String id, int tempoRestante) {
		this.id = id;
		this.tempoRestante = tempoRestante;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTempoRestante() {
		return tempoRestante;
	}

	public void setTempoRestante(int tempoRestante) {
		this.tempoRestante = tempoRestante;
	}
	
	
	
	

}
