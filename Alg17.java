import java.util.Scanner;

public class Alg17{
	public static void main (String[] args){

		Scanner ler = new Scanner (System.in);

		int idade;

		System.out.println("entre com a idade do nadador");
		idade=ler.nextInt();

		if (idade>=5 && idade<=12)
		    System.out.println("o nadador e da categoria infantil");

		else if (idade>=13 && idade<=17)
			 System.out.println("o nadador e da categoria juvenil");
		 else if (idade>=18 && idade<=25)
		 	System.out.println("o nadador e da categoria profissional");
		else
				System.out.println("nao e nadador");

	}
}