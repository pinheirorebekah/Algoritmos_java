import java.util.Scanner;

public class Alg24{
	public static void main (String[]args){

		Scanner ler = new Scanner(System.in);

		int a, b;
		double soma;

		System.out.print("Entre com dois numeros para serem somados");
		a=ler.nextInt();
		b=ler.nextInt();

		soma = a+b;

		if (soma>=10)
				System.out.print("A soma dos numeros, "+a+" e "+b+" e: " + soma);

	}
}