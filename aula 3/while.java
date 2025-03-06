import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas pessoas estarão inclusas na sua reserva:");
        int pessoas = leitor.nextInt();

        while(pessoas < 0 || pessoas > 5){
            System.out.println("Inválido, digite novamente");
            System.out.println("Digite novamente quantas pessoas terão na sua reserva: ");
            pessoas = leitor.nextInt();

        }
        System.out.println("Reserva concluida!");
        
        leitor.close();
    }

}
