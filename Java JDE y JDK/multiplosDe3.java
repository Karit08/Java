
public class multiplosDe3 {
	public static void main(String[] args) {
		//Usa un bucle for para imprimir todos los múltiplos de 3, entre 1 y 100.
		System.out.println("Opcion 1");
		for(int numero=1; numero<100; numero++) {
			if(numero%3 ==0){
				System.out.println(numero);
			}
		}
		
		System.out.println("Opcion 2");
		
		for(int numero1=3; numero1<100; numero1 += 3) {
			System.out.println(numero1);
		}
		
		//En este ejercicio opcional, tu desafío es imprimir los factoriales del 1 al 10.
		
		System.out.println("Factorial");
		
		int total=1;
		for(int factorial=1; factorial<=10; factorial++) {
			total= total*factorial;
			System.out.println("Factorial de " + factorial + " = " + total);
		}
	}
}
