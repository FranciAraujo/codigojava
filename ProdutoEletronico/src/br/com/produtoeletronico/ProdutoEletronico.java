package br.com.produtoeletronico;

public class ProdutoEletronico {
	
	private String nome;
	private String marca;
	private double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double aplicarDesconto (int desconto){
		return this.preco - (this.preco * desconto/100); 
}

}