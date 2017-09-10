package br.com.senac.restaurante;

public class Restaurante {
	
	private Prato[] pratos = new Prato[3];
	
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

	public void setPratos(Prato[] pratos) {
		this.pratos = pratos;
	}

}
