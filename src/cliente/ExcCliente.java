package cliente;

public class ExcCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Matheus", 42, 258410, "Avenida paulista" );
		
		System.out.println("Nome do cliente: "+ cliente1.getNome());
		System.out.println("Nome do cliente: "+ cliente1.getIdade());
		System.out.println("Nome do cliente: "+ cliente1.getEndereco());
		
	}

}
