import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float celsius;
        int opcao;

        Scanner leitor = new Scanner(System.in);

        System.out.println("digite a temperatura em Celsius: ");
        celsius = leitor.nextInt();

        System.out.println(" Escolha a conversão, 1- Fahrenheit 2- Kelvin ");
        opcao = leitor.nextInt();


        if (opcao == 1) {
            float faren = (celsius * (1.8f)) + 32;
            System.out.println("A temperatura em Farenheit é de: " + faren);
        } else if (opcao == 2) {
            float kelvin = celsius + 273.15f;
            System.out.println("A temperatura em Kelvin é de: " + kelvin);
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
