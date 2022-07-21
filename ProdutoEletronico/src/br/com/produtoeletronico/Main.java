package br.com.produtoeletronico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ProdutoEletronico p1 = new ProdutoEletronico();
p1.setNome("consola");
p1.setMarca("NeoGeo");
p1.setPreco(1000);

System.out.println("Nome do produto: " + p1.getNome());
System.out.println("Nome da marca: " + p1.getMarca());
System.out.println("Nome do preço: " + p1.getPreco());
System.out.println("Preço com desconto:" + p1.aplicarDesconto(20));
	}
	

}
