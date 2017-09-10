package br.com.senac.restaurante;

import java.util.ArrayList;

public class Restaurante {
	
	private Prato[] pratos = new Prato[3];
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	public String mostrarCardapio(){
		String cardapio = "";
		for (Prato prato : pratos) {
			cardapio = cardapio +
					prato.getNome() + ": R$ " + prato.getPreco() + 
					"\nDescrição do Prato: " + prato.getDescricao() + 
					"\n";
		}
		
		return cardapio;
	}

	public Prato[] getPratos() {
		return pratos;
	}
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void criaPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public double getTotalCaixa(){
		double total = 0;
		
		for (Pedido pedido : pedidos) {
			total = total + pedido.getTotal();
		}
		
		return total;
	}

	public void setPratos(Prato[] pratos) {
		this.pratos = pratos;
	}
	
}
