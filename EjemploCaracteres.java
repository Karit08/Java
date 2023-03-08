
public class EjemploCaracteres {

	public static void main(String[] args) {
		//Caracter ----------------------------

		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 65;
		System.out.println(caracter);
		
		caracter = 65 + 1;
		char segundoCaracter = (char) (caracter + 1);// se fuerza a que el resultado sea un tipo char
		
		System.out.println(segundoCaracter);

		
		// String ----------------------------
		String saludo = "Hola, mi nombre es ";
		String nombre = "Kar";
		String continuacion = "y mi edad es ";
		int edad = 27;
		System.out.println (saludo + nombre + continuacion + edad);
		
		String palabra = "Alura cursos online";
		System.out.println(palabra);
		
		palabra = palabra + "2023";
		System.out.println(palabra);
	}
}
