public class Main {
    public static void main(String[] args) {

        Personagem[] personagens = new Personagem[3];

        personagens[0] = new Guerreiro("Garen", "Espada", 50, 35);
        personagens[1] = new Mago("Vladmir", "Catalizador",50, 25);
        personagens[2] = new Arqueiro();
        personagens[3] = new Assassino();


    }
}
