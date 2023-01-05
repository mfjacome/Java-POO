package transporte;

public class Patinete {
	private String cor;
	private double valor;
	private String marcaModelo;
	
	public Patinete(String cor, double valor, String marcaModelo) {
		this.cor = cor;
		this.valor = valor;
		this.marcaModelo = marcaModelo;	
	}
	
	public Patinete() {}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getMarcaModelo() {
		return marcaModelo;
	}
	public void setMarcaModelo(String marcaModelo) {
		this.marcaModelo = marcaModelo;
	}
}