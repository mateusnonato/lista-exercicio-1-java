import java.util.Scanner; 

public class ExercicioNove { 

	public static void main(String[] args) { 

		double numero, horas, minutos; 
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Exibir um numero em segundos, minutos e horas."); 

		System.out.println("Digite o numero: "); 
		numero = scanner.nextDouble(); 

        minutos = numero /60;
        horas = numero /3600;

		System.out.printf("\nNumero em segundos: %.0f", numero); 
		System.out.printf("\nNumero em minutos: %.2f", minutos);
		System.out.printf("\nNumero em horas: %.2f", horas);
 
		scanner.close(); 
	}
}