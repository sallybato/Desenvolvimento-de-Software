public class Funcionario extends Pessoa {
    // pois o funcionario é uma pessoa
    String cargo;
    float salario;

   Funcionario(String cpf, String nome, String cargo, float salario){
       super(cpf, nome);
       this.cargo = cargo;
       this.salario = salario;
   }

    void trabalhar(){
        System.out.println("| Está" + this.nome + "|"); // esta usando uma variavel importada de Pessoa "nome"
        System.out.println("| Trabalhando com " + this.cargo + "|");
        System.out.println("| Ganhando R$:" + this.salario + "|");
    }

}
