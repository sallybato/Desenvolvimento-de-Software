public class Gerente extends Funcionario{

    int tamanhoEquipe;
    Gerente(String cpf, String nome, String cargo, float salario, int tamanhoEquipe){
        super(cpf,nome,cargo,salario);
        this.tamanhoEquipe = tamanhoEquipe;
    }

    void liderar(){
        System.out.println("| Gerente: " + this.nome);
        System.out.println("> está liderando uma equipe de " + this.tamanhoEquipe + "pessoas.");
        System.out.println("> ganhando salário R$" + this.salario);
        System.out.println("> no cargo: " + this.cargo);
    }
}
