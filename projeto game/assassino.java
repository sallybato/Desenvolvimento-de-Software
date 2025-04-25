public class Assassino extends Personagem{

    Assassino(String nome, String arma, int vida, int dano, String funcao){
        super(nome, arma, vida, dano,funcao);
    }
    @Override
    public void atacar(){
        System.out.println("| Assassino [" + getNome() + "] ataca com arma: " + getArma());
    }
}
