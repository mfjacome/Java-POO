package aviao;

public class TestAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao novoAviao = new Aviao(2,false,"carga","boeing","Gol","branco",6000,2,4,true);
		System.out.println(novoAviao.getTipoTransporte());
		System.out.println(novoAviao.getCapacidade());
	}

}
