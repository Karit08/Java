package bytebank;

public class TestReferencias {

	public static void main(String[] args) {
		

		// Elemento mas generico puede ser adaptado
		//                     al elemento mas especifico
		Funcionario funcionario = new Gerente(); // Gerente hereda de Funcionario, todos los GERENTES son FUNCIONARIOS
		funcionario.setNombre("Diego");
		
		//Gerente gerente = new Funcionario(); // Esto no compila porqué nos todos los FUNCIONARIOS son GERENTES
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		//funcionario.iniciarSesion("Hola"); // no compila por qué la referencia de FUNCIONARIO no tiene el método
		gerente.iniciarSesion("_ddddd");
				
	}
	
}
