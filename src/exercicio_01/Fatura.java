package exercicio_01;



public class Fatura {
	private String numero;
	private String descricao;
	private int qnt;
	private double preco;

	public Fatura(String numero, String descricao, int qnt, double preco) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.qnt = qnt;
		this.preco = preco;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	//o valorda fatura e depois retorna o valor como um double. Se o valor não for positivo, ele
	//deveser configurado como 0. Se o preço por item não for positivo, ele deve ser configuradocomo 0.0.
	//Escreva um aplicativo de teste chamado FaturaTeste (em outro arquivo) quedemonstra as capacidades
	//da classe Fatura.

	public double getTotalFatura() {
		double total = this.qnt * this.preco;
		return total > 0 ? total : 0;
	}
}
