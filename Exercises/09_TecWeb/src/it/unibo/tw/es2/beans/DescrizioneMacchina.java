package it.unibo.tw.es2.beans;

public class DescrizioneMacchina {
	
	private String modello;
	private String colore;
	
	public DescrizioneMacchina(String modello, String colore) {
		super();
		this.modello = modello;
		this.colore = colore;
	}

	public DescrizioneMacchina() {
		
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getModello() {
		return modello;
	}

	public String getColore() {
		return colore;
	}
	
}
