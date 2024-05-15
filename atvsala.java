import java.util.Scanner;

public class atvsala{
	 public static void main(String[] args){
	 	Scanner ler = new Scanner(System.in);

	 	double precoVenda, precoFinal, valorAumento, aumento;


	 		System.out.println("Entre com o valor para reajuste");
	 		precoVenda=ler.nextDouble();


	 		if (precoVenda<=100)
	 			valorAumento =  precoVenda * 0.20;

	 		else if (precoVenda>=100.01 && precoVenda<=2000)
	 			valorAumento = precoVenda * 0.15;

	 		else
	 		  valorAumento = precoVenda * 0.10;


	 		  precoFinal = precoVenda + valorAumento;
	 		  aumento =  precoFinal - precoVenda;

	 		  System.out.println("O valor final e: " + precoFinal);
	 		  System.out.println("O valor do aumento e: " + aumento);
	 }
}
