import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		double capital, prazo, juros, porcentagem, montante;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculo de Juros Composto");

		System.out.println("Informe o Capital: ");
		 capital = scanner.nextDouble();

        System.out.println("Qual prazo de aplicação em meses? ");
		 prazo = scanner.nextDouble();

        System.out.println("Informe a taxa de juros mensal: ");
		 juros = scanner.nextDouble();
        
		 porcentagem = juros / 100;
         montante = Math.pow(1 + porcentagem, prazo) * capital; 
	
		System.out.printf("O valor da montante é: %.2f", montante);
		scanner.close();
	}
}
