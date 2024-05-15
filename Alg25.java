import java.util.Scanner;

public class Alg25{
	public static void main(String[]args){


	Scanner ler = new Scanner(System.in);

	int idade;
	System.out.print("Entre com uma idade");
	idade=ler.nextInt();

	if (idade>0){
		if (idade<18)
			System.out.print("Menor de idade");
     	else if (idade>=18 && idade<65)
		System.out.print("Maior de idade");
    	else
		System.out.print("Idoso");
	}
	else
		System.out.print("Idade invalida");
	}
}