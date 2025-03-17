import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

      System.out.println("Olá insira seu número: ");
      int numero = leitor.nextInt();

      if(numero >= 50){
          System.out.println("NUMERO DIGITADO É MAIOR OU IGUAL A 50!");
      }
      else{
          System.out.println("NUMERO DIGITADO É MENOR OU IGUAL A 50!");
      }
      leitor.close();
    }
}
