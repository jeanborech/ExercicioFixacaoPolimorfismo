package Entidades_polimorfismo;

public class ProdutoImportado extends Produto{

	private Double taxaAlfandega;
	private String etiquetaImportado;
	private Double precoTotal;
	
	ProdutoImportado(){
		super();
	}

	public ProdutoImportado(String nome, Double preco, String precoEtiqueta, Double taxaAlfandega,
			String etiquetaImportado, Double precoTotal) {
		super(nome, preco, precoEtiqueta);
		this.taxaAlfandega = taxaAlfandega;
		this.etiquetaImportado = etiquetaImportado;
		this.precoTotal = precoTotal;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public String getEtiquetaImportado() {
		return etiquetaImportado;
	}

	public void setEtiquetaImportado(String etiquetaImportado) {
		this.etiquetaImportado = etiquetaImportado;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	
	
	
	
}
