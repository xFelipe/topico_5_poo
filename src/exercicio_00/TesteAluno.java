package exercicio_00;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno("Márcio", "Física", 8.2);
		Aluno a2 = new Aluno("Alex", "Matemática", 4.5);
		
		System.out.println(a.mostrarSituacao());
		System.out.println(a2.mostrarSituacao());
	}

}
