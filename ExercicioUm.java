import java.util.Scanner; 

public class ExercicioUm { 

	public static void main(String[] args) { 

		double numeroUm, numeroDois, media; 
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Média Aritmética de dois numeros"); 
		System.out.println("Informe o primeiro número: "); 
		numeroUm = scanner.nextDouble(); 

		System.out.println("Informe o segundo número: "); 
		numeroDois = scanner.nextDouble(); 

		media = (numeroUm + numeroDois) / 2;
		
		System.out.printf("A média dos números é: %.2f", media); 
		scanner.close(); 
	}
}