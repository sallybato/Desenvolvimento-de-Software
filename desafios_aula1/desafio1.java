import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*int num = 8;
        float numero_real = 1.03f;
        String frase = "legal";
        char caracter = 'a';
        boolean verdadeiro = false;


        float soma = num + numero_real;
            System.out.println("a soma de " + num + " + " + numero_real + " é: " + soma);
    }*/

        Scanner leitor = new Scanner(System.in);


       /* System.out.print("Qual é o seu nome? ");
        String nome = leitor.nextLine();*/

        /*System.out.print("Qual é a sua idade?: ");
        int idade = leitor.nextInt();
        leitor.nextLine();


        leitor.close();*/


        System.out.println("Digite um numero: ");
        int num = leitor.nextInt();
        leitor.nextLine();

         float multiplica = num * 2;

         System.out.println(" O dobro do número é: " + multiplica);
    }
}
