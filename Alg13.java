import java.util.Scanner;
public class Alg13 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);

		int num;
		System.out.println("Entre com um numero");
		num=ler.nextInt();

		if (num==0)
			System.out.println("O numero e nulo.");
	   else if (num>0)
			System.out.println("O numero e par.");
		else
			System.out.println("O numero e impar.");
	}
}