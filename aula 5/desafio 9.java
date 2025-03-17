import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner leitor = new Scanner(System.in);
      int maior;

      System.out.println("Ola insira o valor da variável A: ");
      int A = leitor.nextInt();

        System.out.println("Ola insira o valor da variável B: ");
        int B = leitor.nextInt();

        if( A > B){
            maior = A;
        }
        else{
            maior = B;
        }
        if( A == B){
            System.out.println("OS NUMEROS SAO IGUAIS!");
        }
        else{

            System.out.println("OS NUMEROS SAO DIFERENTES! o maior número é: " + maior);

        }
       leitor.close();
    }
}
