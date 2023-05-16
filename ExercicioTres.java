import java.util.Scanner; 

public class ExercicioTres { 

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in);

        System.out.println("Conversão de F° para °C");
        System.out.println("Digite a temperatura em °F");
 	    double fahrenheit = scanner.nextDouble();

        double conversao = (fahrenheit - 32)/1.8;
		System.out.printf("O resultado da conversao em °C é: %.2f", conversao);
        
        scanner.close();
	}
}
