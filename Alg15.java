import java.util.Scanner;
public class Alg15 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);

		int golcruzeiro, golatletico;


		System.out.println("Cruzeiro fez quantos gols?");
		golcruzeiro=ler.nextInt();

		System.out.println("Atletico fez quantos gols?");
		golatletico=ler.nextInt();

		if 	(golcruzeiro == golatletico)
		 System.out.println("foi um empate");
		else if (golcruzeiro > golatletico)
		 	System.out.println("Cruzeiro ganhou");
	    else
		 	System.out.println("Atletico ganhou");
	}
}
