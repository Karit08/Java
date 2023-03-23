package bytebank;

public class ControlBonificacion {

	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
	
	//Se puede solo usar una función porque todos son funcionarios, no se necesita uno por cada uno
	/*public double registrarSalario(Gerente gerente) {
			this.suma = gerente.getBonificacion() + this.suma;
			System.out.println("Calculo actual: "+ this.suma);
			return this.suma;
		}
		
		public double registrarSalario(Contador contador) {
			this.suma = contador.getBonificacion() + this.suma;
			System.out.println("Calculo actual: "+ this.suma);
			return this.suma;
		}*/ 
	
}
