import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá insira o numero de sua matricula (8 digitos): ");
        int matricula = leitor.nextInt();
                 leitor.nextLine();

        System.out.println("informe seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("insira a nota 1: ");
        float nota1 = leitor.nextFloat();

        System.out.println("insira a nota 2: ");
        float nota2 = leitor.nextFloat();

        float notafinal = (nota1 + nota2) / 2;

        if(notafinal >= 6){
            System.out.println("\nMatricula: " + matricula +"\nNome: "
                    + nome +"\nAprovado: [x]Sim []Não" + "\nNota final: "+ notafinal);
        }
        else{
            System.out.println("\nMatricula: " + matricula +"\nNome: "
                    + nome +"\nAprovado: []Sim [x]Não" + "\nNota final: "+ notafinal);
        }

    }
}
