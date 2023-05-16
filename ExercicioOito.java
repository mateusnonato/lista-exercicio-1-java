import java.util.Scanner; 
public class ExercicioOito{

  public static void main(String[] args){
       
    double veiculos, rodas, carros, motos;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Calculo de Carros e Motos no Estacionamento");
    System.out.println("Informe o número de veículos:");
    veiculos = scanner.nextDouble();
    
    System.out.println("Informe o numero de rodas:");
    rodas = scanner.nextDouble();

    motos = ((4* veiculos) - rodas)/2;
    carros = (veiculos - motos);

    System.out.printf("\nTotal de carros: %.0f", carros);
    System.out.printf("\nTotal de motos: %.0f", motos);
    scanner.close();
    }
}    