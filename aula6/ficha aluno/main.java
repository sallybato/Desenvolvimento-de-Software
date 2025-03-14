import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno[] turma = new Aluno[4];

        System.out.println("Os alunos da turma xxx são:");

        turma[0] = new Aluno();/*criação do aluno*/
        turma[1] = new Aluno();
        turma[2] = new Aluno();
        turma[3] = new Aluno();
        

        turma[0].nome = "Joao";
        turma[0].matricula = 1111;
        turma[0].nota1 = 3.0f;
        turma[0].nota2 = 1.0f;
        turma[0].Soma();

        turma[1].nome = "Bruna";
        turma[1].matricula = 2222;
        turma[1].nota1 = 8.0f;
        turma[1].nota2 = 1.3f;
        turma[1].Soma();

        turma[2].nome = "Matheus";
        turma[2].matricula = 3333;
        turma[2].nota1 = 7.0f;
        turma[2].nota2 = 7.6f;
        turma[2].Soma();

        turma[3].nome = "Becca";
        turma[3].matricula = 4444;
        turma[3].nota1 = 4.5f;
        turma[3].nota2 = 3.8f;
        turma[3].Soma();

        for (int i = 0; i < 4; i++) {
            turma[i].verMatricula();
            turma[i].verNome();
            turma[i].verNota1();
            turma[i].verNota2();
            turma[i].Soma();

            if (turma[i].media() >= 6){
                System.out.println("Aprovado (X)( )");
            }
            else{
                System.out.println("Aprovado ( )(X)");
            }
            turma[i].verMedia();
            System.out.println("");
        }


    }
}
