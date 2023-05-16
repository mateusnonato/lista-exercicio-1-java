import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		double numero, base, resultado; 

		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculo de Logaritmo");

		System.out.println("Informe o numero: ");
		 numero = scanner.nextDouble();

        System.out.println("Informe a base: ");
		 base = scanner.nextDouble();
  
	    resultado = (Math.log(numero)) / (Math.log(base));

		System.out.printf("O valor do logaritmo: %.2f", resultado);
		scanner.close();
	}
}