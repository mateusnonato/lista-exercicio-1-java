import java.util.Scanner; 

public class ExercicioDez { 

	public static void main(String[] args) { 

	System.out.println("Médias Aritimética, Harmônica e Geométrica");
	
	double numeroUm, numeroDois, numeroTres, mediaAri, mediaHar, mediaGeo;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o primeiro número: ");
    numeroUm = scanner.nextDouble();

    System.out.println("Informe o segundo número: ");
    numeroDois = scanner.nextDouble();

    System.out.println("Informe o terceiro número: ");
    numeroTres = scanner.nextDouble();

    mediaAri = (numeroUm + numeroDois + numeroTres)/3;
    mediaHar = 3/((1/numeroUm) + (1/numeroDois) + (1/numeroTres));
    mediaGeo = Math.cbrt(numeroUm * numeroDois * numeroTres);

    System.out.printf("\nMédia Aritimética: %.2f %n", mediaAri);
    
    System.out.printf("Média Harmônica: %.2f %n", mediaHar);

    System.out.printf("Média Geométrica: %.2f %n", mediaGeo);

    scanner.close();
	}
}