package bytebank;

//Se realizan pruebas de la clase Funcionario
public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setDocumento("Diego");
		diego.setDocumento("444556665");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
