import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Primeiro Número: ");
        int num1 = leitor.nextInt();
        leitor.nextLine();

        System.out.println ("Segundo Número: ");
        int num2 = leitor.nextInt();
        leitor.nextLine();

       float soma = num1 + num2;

       System.out.print("A soma dos dois números é: " + soma);

    }
}
