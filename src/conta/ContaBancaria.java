package conta;
//nome do objeto
public class ContaBancaria {
	//Atributos/Caracterisiticas do objeto
	//private determina que o atributo pode ser usado apenas por essa classe.
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	public ContaBancaria(int numero, int agencia, int tipo, String titular, float saldo) {
		//não importa a ordem de atribuíção
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public ContaBancaria() {
	}
	
	//Métodos acessores da Classe ContaBancaria 
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//Metodos especificos de uma conta bancaria
	public boolean sacar(float valorSaque) {
		
		if(this.getSaldo() < valorSaque) {
			System.out.println("Saldo insuficiente! Tente outro valor.");
			return false;
			//saldo = saldo - valorSaque;
		} 
		
		this.setSaldo(this.getSaldo() - valorSaque);
		System.out.println("Saque realizado com sucesso! Seu saldo atual é: "+ this.getSaldo());
		return true;
	}
	
}

