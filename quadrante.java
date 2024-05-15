import java.util.Scanner;

public class quadrante {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("entre com o valor de x:");
        double x = ler.nextDouble();

        System.out.println("entre o valor de y:");
        double y = ler.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("O ponto esta no primeiro quadrante.");
        }
         else if (x < 0 && y > 0) {
            System.out.println("O ponto esta no segundo quadrante.");
        }
         else if (x < 0 && y < 0) {
            System.out.println("O ponto esta no terceiro quadrante.");
        }
         else if (x > 0 && y < 0) {
            System.out.println("O ponto esta no quarto quadrante.");
        }
         else if (x == 0 && y != 0) {
            System.out.println("O ponto esta sobre o eixo das ordenadas.");
        }
         else if (x != 0 && y == 0) {
            System.out.println("O ponto esta sobre o eixo das abscissas.");
        }
         else {
            System.out.println("O ponto esta na origem.");
        }
    }
}