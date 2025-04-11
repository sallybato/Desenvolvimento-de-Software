public class Cliente extends Pessoa{

    String email;

    Cliente(String cpf, String nome, String email) {
        super(cpf, nome); // chamando o construtuor de pessoa e
        // passando pro construtor de cliente
        this.email = email;

    }
        void comprar(){
            System.out.println("Cliente" + this.nome + " fazendo compras...");
            System.out.println("...enviar comprovante para" + this.email);

        }
       // this.nome = nome;
       // this.cpf = cpf;


    }


