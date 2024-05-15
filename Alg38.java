import java.util.Scanner;
public class Alg38{
    public static void main (String[]args){
        Scanner ler = new Scanner (System.in);

        int somaPos = 0, somaNeg = 0, cont = 0, qtdPos = 0, qtdNeg = 0;

        while(cont<15){
         System.out.println("entre com os numeros: ");
        	int numero = ler.nextInt();
        	if(numero!=0){
        		if (numero>0){
        			qtdPos++;
        			somaPos += numero;
        		} else {
        			qtdNeg++;
        			somaNeg += numero;
        		}
        		cont++;
        	} else  System.out.println("o numero nao e aceito, entre com outro");
        }

        System.out.println("Sao " + qtdPos + " valores positivos, e " + qtdNeg + " valores negativos.");
		System.out.println("A soma dos valores positivos e " + somaPos + " , e a soma dos valores negativos e " + somaNeg3 + ".");

    }
}