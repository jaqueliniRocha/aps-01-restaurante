package br.com.senac.restaurante;

public class SistemaDePedidos {

	public static void main(String[] args) {
		System.out.println("Criando pratos e ingredientes...");
		
		Ingrediente ingredientePicanha = new Ingrediente(TipoIngrediente.CARNE, "Picanha", true);
		Ingrediente ingredienteBatata = new Ingrediente(TipoIngrediente.ACOMPANHAMENTO, "Batata", true);
		Prato picanha = new Prato("Picanha com fritas", 10.00);
		picanha.setDescricao("Deliciosa picanha com fritas");
		picanha.setIngredientes(new Ingrediente[]{ingredientePicanha, ingredienteBatata});
		
		Ingrediente ingredienteBrocolis = new Ingrediente(TipoIngrediente.LEGUME, "Brócolis", true);
		Prato picanhaComBrocolis = new Prato("Picanha com Brócolis", 20.00);
		picanhaComBrocolis.setDescricao("Deliciosa picanha com brócolis");
		picanhaComBrocolis.setIngredientes(new Ingrediente[]{ingredientePicanha, ingredienteBrocolis});
		
		Ingrediente ingredienteBatataOpcional = new Ingrediente(TipoIngrediente.ACOMPANHAMENTO, "Batata", false);
		Prato picanhaComBrocolisBatata = new Prato("Picanha com Brócolis (opcional batata)", 25.00);
		picanhaComBrocolisBatata.setDescricao("Deliciosa picanha com brócolis e opcional de batata");
		picanhaComBrocolisBatata.setIngredientes(new Ingrediente[]{ingredientePicanha, ingredienteBrocolis, ingredienteBatataOpcional});
		
		Prato[] pratos = new Prato[]{picanha, picanhaComBrocolis, picanhaComBrocolisBatata};
		
		Restaurante restaurante = new Restaurante();
		
		restaurante.setPratos(pratos);

		System.out.println("Mostrando cardápio...");
		
		System.out.println(restaurante.mostrarCardapio());
		
		System.out.println("Criando pedido...");
		
		Pedido pedido = new Pedido();
		pedido.setPratos(pratos);
		pedido.setValorPago(100.0);
		
		restaurante.criaPedido(pedido);
		
		System.out.println("Total do pedido: " + pedido.getTotal());
		System.out.println("Pago pelo cliente: " + pedido.getValorPago());
		System.out.println("Troco para o cliente: " + pedido.getTroco());
		
		System.out.println("Total no caixa do restaurante: " + restaurante.getTotalCaixa());
	}

}
