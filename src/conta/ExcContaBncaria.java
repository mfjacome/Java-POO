package conta;

public class ExcContaBncaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaBancaria conta = new ContaBancaria(1254, 64, 3, "Matheus", 1200f);
		
		System.out.println("Nº da conta: " + conta.getNumero());
		System.out.println("Nº da agência: " + conta.getAgencia());
		System.out.println("Tipo da conta: " + conta.getTipo());
		System.out.println("Nome do titular: " + conta.getTitular());
		System.out.println("Nº da conta: " + conta.getSaldo());
		
		conta.sacar(500);
	}

}
