package exercicio_00;

public class Aluno {
	private String nome;
	private String disciplina;
	private double notaFinal;

	public Aluno(String nome, String disciplina, double notaFinal) {
		super();
		this.nome = nome;
		this.disciplina = disciplina;
		this.notaFinal = notaFinal;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	public String mostrarSituacao() {
		return "O aluno " + nome + ", matriculado na disciplina " + disciplina + "teve a nota final: " + notaFinal;
	}
	
}
