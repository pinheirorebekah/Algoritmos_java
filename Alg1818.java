import java.util.Scanner;

public class Alg1818 {
	public static void main (String[] args){

		Scanner ler = new Scanner (System.in);

		double salario, reajuste, novoSalario;

		System.out.println("Qual o seu salario?");
		salario=ler.nextDouble();


		if (salario<=500)
			reajuste = salario * 0.15;

		else if (salario >= 500 && salario <= 10000)
			reajuste = salario * 0.10;

		else
			reajuste = salario * 0.5;

			novoSalario = salario + reajuste;

			System.out.println("o valor do novo salario e: " + novoSalario);
			System.out.println("o valor do reajuste e: " + reajuste);
	}
}