package br.com.senac.restaurante;

public class Ingrediente {
	
	private TipoIngrediente tipo;
	private String nome;
	private boolean isObrigatorio;
	
	public Ingrediente(TipoIngrediente tipo, String nome, boolean isObrigatorio) {
		super();
		this.tipo = tipo;
		this.nome = nome;
		this.isObrigatorio = isObrigatorio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoIngrediente getTipo() {
		return tipo;
	}

	public void setTipo(TipoIngrediente tipo) {
		this.tipo = tipo;
	}

	public boolean isObrigatorio() {
		return isObrigatorio;
	}

	public void setIsObrigatorio(boolean isObrigatorio) {
		this.isObrigatorio = isObrigatorio;
	}

}
