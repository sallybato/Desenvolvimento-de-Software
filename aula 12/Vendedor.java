public class Vendedor extends Funcionario{
    String produto;

    Vendedor(String cpf, String nome, String cargo, float salario, String produto){
        super(cpf,nome,cargo,salario);
        this.produto = produto;
    }

    void vender(){
        System.out.println("| Vendedor: " + this.nome);
        System.out.println("> está vendendo:" + this.produto);
        System.out.println("> ganhando salario R$:" + this.salario);
        System.out.println("> seu cargo é:" + this.cargo);
    }
}
