package br.edu.dados;

public class veiculos {

	protected String marca;
	protected Double captanqcomb;
	protected Double velocidade;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getCaptanqcomb() {
		return captanqcomb;
	}
	public void setCaptanqcomb(Double captanqcomb) {
		this.captanqcomb = captanqcomb;
	}

	public void freiar(){
		
	}
	public void buzinar(){
		System.out.println("bibi");
	}
}
