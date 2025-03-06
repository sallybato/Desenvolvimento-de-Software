import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um numero: ");

        int num1 = leitor.nextInt();

        System.out.println("Insira o segundo numero: ");

        int num2 = leitor.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos seus numeros são: " + soma);
    }
}
