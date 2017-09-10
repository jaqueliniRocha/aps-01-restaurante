package br.com.senac.restaurante;

public class Prato {

	private String nome;
	private double preco;
	private String descricao;
	private Ingrediente[] ingredientes;

	public Prato(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.ingredientes = new Ingrediente[3];
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Ingrediente[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
	}

}
