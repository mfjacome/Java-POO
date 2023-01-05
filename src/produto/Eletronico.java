package produto;

public class Eletronico {
	private String marca;
	private int voltagem;
	private double valor;
	private String tipo;
	
	public Eletronico(String marca, int voltagem, double valor, String tipo) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public Eletronico() {}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
