package bytebank;

public class Administrador extends Funcionario implements Autenticable {
// EL administrador es un Funcionario y esta identificado/rotulado con la Autenticación
	private String clave;

	public Administrador() {
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		if(this.clave == clave) {
			return true;
		} else {
			return false;
		}
	}

}
