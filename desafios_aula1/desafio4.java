import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = leitor.nextInt();
        int suc = num + 1;
        int ant = num - 1;

        System.out.println( "o antecessor de " + num + " é " + ant + " e o sucessor é: " + suc );

    }
}
