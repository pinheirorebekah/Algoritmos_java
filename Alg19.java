import java.util.Scanner;

public class Alg19{
	public static void main (String[] args){

		Scanner ler = new Scanner (System.in);

		int idade;

			System.out.printf("Entre com sua idade");
			idade=ler.nextInt();

			if (idade<16)
				System.out.printf("Nao eleitor");
			else if (idade>18 && idade<=65)
				System.out.printf("Eleitor obrigatorio");
			else if (idade>=16 && idade<=18)
				System.out.printf("Eleitor facultativo");
			else if (idade>65)
				System.out.printf("Eleitor facultativo");

	}
}