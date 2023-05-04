
public class EjercicioMatriz {

	public static void main(String[] args) {
		
		System.out.println("Triangulo condicion");
		for(int fila1 = 0; fila1 <= 10; fila1++) {
			for(int columna1 = 0; columna1 < fila1; columna1++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("Triangulo break/if");
		for(int fila=0; fila<=10; fila++) {
			for(int columna=0; columna<=10; columna++) {
				if(columna > fila) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
}
