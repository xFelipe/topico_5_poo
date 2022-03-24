package exercicio_01;

public class Main {

	public static void main(String[] args) {
		Fatura f = new Fatura("852131202", "Detergente", 5, 2.50);
		f.setDescricao("Detergente");
		
		System.out.println("A fatura do produto " + f.getDescricao() + " número:" + f.getNumero());
		System.out.println("com preco: R$:" + f.getPreco() + " e quantidade: " + f.getQnt());
		System.out.println("é de: R$:" + f.getTotalFatura());
	}

}
