public class Guerreiro extends Personagem{

    Guerreiro(String nome,String arma,float vida, float dano){
        super(nome,arma,vida,dano);

    }
    @Override
    void atacar(){
        System.out.println("| Guerreiro [" + this.nome + "] ataca com arma: " + this.arma);
    }

}
