import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, por favor insira um numero: ");
        int num = leitor.nextInt();

        if(num >= 100 && num <= 200){
            System.out.println(" O número esta entre 100 e 200!");
        }
        else{
            System.out.println("O número está fora do intervalo!");
        }
        leitor.close();
    }
}
