import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o saldo atual: ");
        float saldo = leitor.nextFloat();
        System.out.println("Escolha uma operação 1- Ver saldo 2-Sacar 3-Depositar 4-Sair");

        int op = leitor.nextInt();

        switch (op){

            case 1:
                System.out.println("O saldo é: " + saldo);
                break;

            case 2:
                System.out.println("Digite o valor do saque:");
                float saque = leitor.nextFloat();

                if(saldo > saque){
                    saldo = saldo - saque;
                    System.out.println("O saque é " + saque + "O saldo restante é " + saldo);
                }
                else{
                    System.out.println("O saldo não é suficiente para fazer um saque!");
                }
                break;

            case 3:
                System.out.println("Digite o valor do depósito");
                float deposito = leitor.nextFloat();

                System.out.println("O seu depósito é de valor " + deposito);
                saldo = saldo + deposito;
                System.out.println("O seu saldo atual após o depósito é de: " + saldo);
                break;

            case 4:
                System.out.println("Adeus! até breve :)");
                break;
        }

    }
}
