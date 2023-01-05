package transporte;

public class TestPatinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patinete novoPatinete = new Patinete();
		novoPatinete.setCor("Vermelho");
		novoPatinete.setMarcaModelo("Voltxz");
		novoPatinete.setValor(1500);
		
		System.out.println(novoPatinete.getCor());
		System.out.println(novoPatinete.getMarcaModelo());
		System.out.println(novoPatinete.getValor());
	}

}
