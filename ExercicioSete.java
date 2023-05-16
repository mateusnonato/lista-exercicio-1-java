import java.util.Scanner; 

public class ExercicioSete { 

	public static void main(String[] args) { 

		double salario, vendas, comissao, comissaototal, salariofinal; 
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Calculo Salario com Comissão."); 

		System.out.println("Digite o salario fixo do vendedor: "); 
		salario = scanner.nextDouble(); 

        System.out.println("Digite o valor total das vendas: "); 
		vendas = scanner.nextDouble(); 

		System.out.println("Informe a porcentagem da comissão a receber: ");
		comissao = scanner.nextDouble();

		comissaototal = vendas * (comissao/100);
        salariofinal = salario +  comissaototal;
		
        System.out.printf("\nO valor da comissão é : %.2f", comissaototal); 
		System.out.printf("\nO salario do funcionario é: %.2f", salariofinal); 
		scanner.close();
	}
}