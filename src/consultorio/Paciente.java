package consultorio;

public class Paciente {
	
	private String nome;
	private int cpf;
	private int registroSus;
	private String endereco;
	
	public Paciente(String nome, int cpf, int registroSus, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.registroSus = registroSus;
		this.endereco = endereco;
	}
	
	public Paciente() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRegistroSus() {
		return registroSus;
	}

	public void setRegistroSus(int registroSus) {
		this.registroSus = registroSus;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
