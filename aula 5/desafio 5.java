import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o valor A: ");
        int A = leitor.nextInt();

        System.out.println("Insira o valor B: ");
        int B = leitor.nextInt();

        System.out.println("Valores de A e B antes da troca: " + A + " " + B);

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valores de A e B após a troca: " + A + " " + B);

    }
}
