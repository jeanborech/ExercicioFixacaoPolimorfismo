package Entidades_polimorfismo;

public class Produto {

	private String nome;
	private Double preco;
	private String precoEtiqueta;
	
	public Produto() {
	}

	public Produto(String nome, Double preco, String precoEtiqueta) {
		this.nome = nome;
		this.preco = preco;
		this.precoEtiqueta = precoEtiqueta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getPrecoEtiqueta() {
		return precoEtiqueta;
	}

	public void setPrecoEtiqueta(String precoEtiqueta) {
		this.precoEtiqueta = precoEtiqueta;
	}
	
	
	
}
