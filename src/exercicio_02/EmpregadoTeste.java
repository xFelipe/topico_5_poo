package exercicio_02;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregado e1 = new Empregado("Cássio", "Freitas", 2000d);
		Empregado e2 = new Empregado("Fred", "Gracie", 3000d);

		System.out.println("O salário de " + e1.getNome() + " " + e1.getSobrenome() + "é de R$:" + e1.getSalario());
		System.out.println("O salário de " + e2.getNome() + " " + e2.getSobrenome() + "é de R$:" + e2.getSalario());

		e1.setSalario(e1.getSalario() * 1.1);
		e2.setSalario(e2.getSalario() * 1.1);

		System.out.println("Um aumento de 10% foi aplicado aos funcionários.");

		System.out.println("O salário de " + e1.getNome() + " " + e1.getSobrenome() + " agora é de R$:" + e1.getSalario());
		System.out.println("O salário de " + e2.getNome() + " " + e2.getSobrenome() + " agora é de R$:" + e2.getSalario());
	}

}
