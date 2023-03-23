package bytebank;

public class SistemaInterno {
	
	private String clave = "AluraCursosOnLine";
	
	public boolean autentica(Autenticable gerente) { 
		// puede usar el rotulo/idenificador para ejecutar este método
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
	}

}
