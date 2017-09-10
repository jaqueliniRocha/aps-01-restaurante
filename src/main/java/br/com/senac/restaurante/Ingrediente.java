package br.com.senac.restaurante;

public class Ingrediente {
	
	private TipoIngrediente tipo;
	private boolean isObrigatorio;

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
