import java.util.Scanner;

public class Alg2626{
	public static void main (String[]args){

		Scanner ler = new Scanner(System.in);

		 String valVenda
	 	double nomeProduto, valCompra;

	 	System.out.println("Qual o produto?");
        	nomeProduto=ler.nextDouble();
        System.out.println("Qual o valor do produto?");
        	valCompra=ler.nextDouble();
        System.out.println("O valor da venda e" + valVenda );
	        valVenda=ler.nextLine();

        if (valCompra<100)
	 			valVenda =  valCompra * 0.70;
	 		else if (valCompra>100 && valCompra<200)
	 			valVenda =  valCompra * 0.50;
	 		else
	 			valVenda =  valCompra * 0.30;

	}
}
