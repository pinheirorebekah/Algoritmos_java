import java.util.Scanner;

public class Alg21{
	public static void main (String[] args){

		Scanner ler = new Scanner(System.in);

		int numero1, numero2;
		System.out.print("Entre com o primeiro numero");
		numero1=ler.nextInt();
		System.out.print("Entre com o segundo numero");
		numero2=ler.nextInt();

		if (numero1>numero2)
			System.out.print("Ordem crescente: "+ numero2 +","+ numero1);
	    else if(numero1==numero2)
	    	 System.out.print("numeros iguais");
	    else
	    	System.out.print("Ordem decrescente: "+ numero1 +","+ numero2);
	}
}