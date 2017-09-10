package br.com.senac.restaurante;

public class Pedido {

	private double total;
	private Prato[] pratos = new Prato[3];

	public double getTotal() {
		return total;
	}

	public Prato[] getPratos() {
		return pratos;
	}

	public void setPratos(Prato[] pratos) {
		this.pratos = pratos;
	}
}
