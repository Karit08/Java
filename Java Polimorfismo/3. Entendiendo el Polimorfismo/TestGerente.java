package bytebank;

//Se hizo la pueda del metodo de bonificación

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		// gerente.setSalario(5000);
		// Funcionario gerente = new Funcionario(); // funcionario no tiene el atributo clave pero el gerente si
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnLine");
		gerente.setTipo(1);
		
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnLine"));
	}
	
}
