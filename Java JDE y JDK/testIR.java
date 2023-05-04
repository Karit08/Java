
public class testIR {
	public static void main(String[] args) {
		
		// De 1900.0 hasta 2800.0 el IR es de 7.5% y se pueden deducir $ 142
        // De 2800.01 hasta 3751.0 el IR es de de 15% y se pueden deducir $ 350
        // De 3751.01 hasta 4664.00 el IR es de de 22.5% y se pueden deducir $ 636
		
		double salario = 3300.0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("El IR es de 7.5%");
			System.out.println("Puede deducir de la declaración el monto de 142");
		}
		if(salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("El IR es de 15%");
			System.out.println("Puede deducir de la declaración el monto de 350");
		}
		if(salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("El IR es de 22.5%");
			System.out.println("Puede deducir de la declaración el monto de 636");
		}
	}
}
