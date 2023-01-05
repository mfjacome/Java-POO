package produto;

public class TestEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eletronico novoProduto = new Eletronico("Whall", 220, 1.500, "máquina de barbearia");
		System.out.println(novoProduto.getMarca());
		System.out.println(novoProduto.getTipo());
	}

}
