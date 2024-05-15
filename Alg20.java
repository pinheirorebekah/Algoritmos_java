import java.util.Scanner;
public class Alg20 {
	public static void main (String[] args) {

		int A, B, C;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com dois valores inteiros");
		A = ler.nextInt();
		B = ler.nextInt();

		if (A==B)
		 	C = A+B;
		else
		 	C = A*B;


		 System.out.println("O valor de A e " + A);
		 System.out.println("O valor de B e " + B);
		 System.out.println("O valor de C e " + C);
	}
}
//Rebekah Pinheiro