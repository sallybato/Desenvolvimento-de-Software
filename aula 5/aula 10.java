import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner leitor = new Scanner(System.in);

      System.out.println("Ola insira o valor da variável A: ");
      int A = leitor.nextInt();

        System.out.println("Ola insira o valor da variável B: ");
        int B = leitor.nextInt();


        if( A == B){
            System.out.println("Os números são iguais!");
        }
        else{

            int maior = Math.max(A, B); /* Em vez de usar a estrutura if-else para determinar qual número é maior,
            você pode usar o método Math.max(A, B) para obter diretamente o maior número.*/

            /*é um método da classe Math em Java, que é usada para
            realizar operações matemáticas comuns. O método max() retorna o maior de dois valores passados como parâmetros.*/
            

            System.out.println("Os números são diferentes! O maior número é: " + maior);
        }
       leitor.close();
    }
}
