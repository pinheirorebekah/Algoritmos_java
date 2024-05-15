import java.util.Scanner;

public class Alg37{
	public static void main (String[]args){

		Scanner ler = new Scanner(System.in);

		int  num=0, pares = 0, impares = 0, nulos=0;

		while(num<=10)
			{

			System.out.print("Entre com um numero");
			num=ler.nextInt();

			if (num % 2 == 0)
			pares++;
		    else
			impares++;

			num = num + 1;

	    	}
		System.out.print("Foram "+pares+" numeros pares e "+impares+" numeros impares");
	}
}