
public class EjemploCiclosWhile2 {

	public static void main(String[] args) {

		int contador = 0;
		int total = 0;

		while (contador <= 10) { 
			total = total + contador;
			contador++;
			// contador += 1;
			// contador = contador + 1;
		}
		System.out.println(total);
	}

}
