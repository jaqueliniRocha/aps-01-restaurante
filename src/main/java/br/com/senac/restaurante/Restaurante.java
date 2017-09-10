package br.com.senac.restaurante;

import java.util.ArrayList;

public class Restaurante {
	
	private Prato[] pratos = new Prato[3];
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	public String mostrarCardapio(){
		String cardapio = "";
		for (Prato prato : pratos) {
			cardapio = cardapio +
					"Nome do Prato: " + prato.getNome() + 
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
}
