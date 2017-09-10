package br.com.senac.restaurante;

public class Pedido {

	private Prato[] pratos = new Prato[3];
	private double valorPago;

	public double getTotal() {
		double total = 0;
		for (Prato prato : pratos) {
			total = total + prato.getPreco();
		}
		
		return total;
	}

	public Prato[] getPratos() {
		return pratos;
	}

	public void setPratos(Prato[] pratos) {
		this.pratos = pratos;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getTroco(){
		return valorPago - getTotal();
	}
}
