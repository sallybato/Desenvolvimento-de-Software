public class Guerreiro extends Personagem{

    Guerreiro(String nome,String arma,int vida, int dano,String funcao){
        super(nome,arma,vida,dano,funcao);

    }
    @Override
    public void atacar(){

        System.out.println("| Guerreiro [" + getNome() + "] ataca com arma: " + getArma());

    }

}
