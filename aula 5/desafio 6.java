import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor insira a temperatura (em Celsius): ");
        int Celsius = leitor.nextInt();

        int F = (9 * Celsius + 160)/5;

        System.out.println("A temperatura convertida é: " + F);
    }
}
