import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personagem[] personagens = new Personagem[4];
        Scanner input = new Scanner(System.in);

        personagens[0] = new Guerreiro("Garen", "Espada", 50, 35,"Guerreiro");
        personagens[1] = new Mago("Vladmir", "Catalizador",50, 25,"Mago");
        personagens[2] = new Arqueiro("Antonio","Arco e flecha", 50, 20, "Arqueiro");
        personagens[3] = new Assassino("Akali", "lança", 50, 30,"Assassino");

        int opcoes;

        do{
            System.out.println("__________________________________________");
            System.out.println("| Olá jogador selecione o que deseja ver |");
            System.out.println("| [1] Mostrar os personagens disponíveis |");
            System.out.println("| [2] Atacar                             |");
            System.out.println("| [3] Mostrar a vida                     |");
            System.out.println("| [4] Sair                               |");
            System.out.println("------------------------------------------");
            opcoes = input.nextInt();
            input.nextLine();

            switch(opcoes){

                case 1:
                    for(int i = 0; i < personagens.length; i++){
                        System.out.print(personagens[i].getFuncao());
                        System.out.print("->");
                        System.out.println(personagens[i].getNome());
                    }
                    break;

                case 2:
                    System.out.println("Escolha o personagem que quer usar pra atacar: ");
                    for(int i = 0; i < personagens.length; i++) {
                        System.out.print("["+i+"] "+personagens[i].getFuncao() + "->");
                        System.out.println(personagens[i].getNome());
                    }
                    int personagemAtacar = input.nextInt();
                    input.nextLine();
                    System.out.println("Escolha o personagem que quer sofrer o ataque: ");
                    for(int i = 0; i < personagens.length; i++) {
                        System.out.print("["+i+"] "+personagens[i].getFuncao() + "->");
                        System.out.println(personagens[i].getNome());
                    }
                    int personagemSofrer = input.nextInt();
                    input.nextLine();

                  break;
            }
        }while(opcoes!=4);

        for (Personagem p: personagens){
            p.atacar();
        }

    }
}
