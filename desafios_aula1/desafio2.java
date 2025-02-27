import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Dia: ");
        int dia = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Mês: ");
        int mes = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Ano: ");
        int ano = leitor.nextInt();
        leitor.nextLine();


        System.out.print("Sua data é: " + dia + "/" + mes + "/" + ano);
    }
}
