package Entidades_polimorfismo;

import java.util.Date;

public class ProdutoUsado extends Produto {

	private Date dataFabricacao;
	private String etiquetaUsado;

	ProdutoUsado(){
		super();
	}

	public ProdutoUsado(String nome, Double preco, String precoEtiqueta, Date dataFabricacao, String etiquetaUsado) {
		super(nome, preco, precoEtiqueta);
		this.dataFabricacao = dataFabricacao;
		this.etiquetaUsado = etiquetaUsado;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String getEtiquetaUsado() {
		return etiquetaUsado;
	}

	public void setEtiquetaUsado(String etiquetaUsado) {
		this.etiquetaUsado = etiquetaUsado;
	}
	
	
	
}
