package exercicio_01;

public class Main {

	public static void main(String[] args) {
		Fatura f = new Fatura("852131202", "Detergente", 5, 2.50);
		f.setDescricao("Detergente");
		
		System.out.println(f.getTotalFatura());
	}

}
