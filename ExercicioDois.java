import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Aumento de 10% do Valor Total");

		System.out.println("Informe o valor: ");
		double numero = scanner.nextDouble();

		double resultado = numero * 1.1;
		
		System.out.printf("O valor com aumento é: %.2f", resultado);	
		scanner.close();
	}
}