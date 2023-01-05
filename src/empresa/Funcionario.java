package empresa;

public class Funcionario {
	private String nome;
	private int matricula;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, int matricula, String cargo, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Funcionario() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
