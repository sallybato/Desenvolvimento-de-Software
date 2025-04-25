public class Arqueiro extends Personagem{

    Arqueiro(String nome, String arma, int vida, int dano, String funcao){
        super(nome, arma, vida, dano,funcao);

    }
    @Override
    public void atacar(){
        System.out.println("|[Arqueiro] " + getNome() + " ataca com arma: " + getArma());
    }
}
