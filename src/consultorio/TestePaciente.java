package consultorio;

public class TestePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente novoPaciente = new Paciente("Olavia Silva", 923845025,12544851 ,"rua teze, 2, grande rio");
		System.out.println(novoPaciente.getNome());
		System.out.println(novoPaciente.getRegistroSus());
	}

}
