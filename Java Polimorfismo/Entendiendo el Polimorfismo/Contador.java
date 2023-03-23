package bytebank;

public class Contador extends Funcionario {

	@Override
	public double getBonificacion() {
		System.out.println("Llamando metodo del Contador");
		return super.getBonificacion();
		// return super.getSalario() * 0.2 ;
	}
	/*Si él encuentra este método aquí, sobreescrito, entonces él va a llamar a este método de aquí, no va a llamar al método de la clase Funcionario. */
}
