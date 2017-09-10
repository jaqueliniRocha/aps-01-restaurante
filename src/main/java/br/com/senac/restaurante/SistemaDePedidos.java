package br.com.senac.restaurante;

public class SistemaDePedidos {

	public static void main(String[] args) {
		System.out.println("Criando pratos...");
		
		Prato lasanha = new Prato("Lasanha de frango", 10.00);
		lasanha.setDescricao("Massa, queijo, presunto, molho e frango");
		
		Prato pizza = new Prato("Pizza", 20.00);
		pizza.setDescricao("Pizza com massa fininha e super rechada");
		
		Prato torrada = new Prato("Torrada", 5.00);
		torrada.setDescricao("Pão, queijo, presunto e maionese");
		
		Prato[] pratos = new Prato[]{lasanha, pizza, torrada};
		
		Restaurante restaurante = new Restaurante();
		
		restaurante.setPratos(pratos);

		System.out.println("Mostrando cardápio...");
		
		System.out.println(restaurante.mostrarCardapio());
		
		System.out.println("Criando pedido...");
		
		Pedido pedido = new Pedido();
		pedido.setPratos(pratos);
		pedido.setValorPago(40.0);
		
		restaurante.criaPedido(pedido);
		
		System.out.println("Total do pedido: " + pedido.getTotal());
		System.out.println("Pago pelo cliente: " + pedido.getValorPago());
		System.out.println("Troco para o cliente: " + pedido.getTroco());
		
		System.out.println("Total no caixa do restaurante: " + restaurante.getTotalCaixa());
	}

}
