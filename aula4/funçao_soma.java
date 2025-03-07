import java.util.Scanner;

public class Main {

    public static int soma(int x, int y){
      int soma = x+y;

      return soma;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int resultado;


            System.out.print("Ola insira o numero 1:");
            int num1 = leitor.nextInt();
                leitor.nextLine();

            System.out.print("Ola insira o numero 2:");
            int num2 = leitor.nextInt();
                 leitor.nextLine();

                 soma( num1,num2);

                 resultado = soma(num1,num2);

                 System.out.print("O resultado da sua soma é: " + resultado);

        leitor.close();
    }
}
