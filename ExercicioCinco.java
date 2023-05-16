import java.util.Scanner; 

public class ExercicioCinco { 

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in);
        
        int filhos = 0;
        double salariofamilia, salariofinal;

        System.out.println("Calculo de salário");
        System.out.println("insira o numero de horas trabalhadas");
        int horas = scanner.nextInt();

        System.out.println("insira o valor da hora");
        double valor = scanner.nextDouble();

        double salario = horas * valor;
        
        // de acordo com a pesquisa feita o direito do salario familia só é garantido se o salario do trabalhador for menor ou igual a 1655,98.
        if (salario <= 1655.98){

            System.out.println("você possui quantos filhos de até 14 anos?");
            filhos = scanner.nextInt();
        }
        else {
            System.out.println("o salario recebido é: " + salario);
        }
        
        if(filhos >= 0){
            salariofamilia = filhos * 56.47;
            salariofinal = salario + salariofamilia;
            System.out.println("o salario recebido é: " + salariofinal); 
        }
        else{
        }
        scanner.close();
	}
}