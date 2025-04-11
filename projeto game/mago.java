public class Mago extends Personagem {

    Mago(String nome,String arma,float vida, float dano){
        super(nome,arma,vida,dano);
    }
    @Override
    void atacar(){
        System.out.println("| Mago [" + this.nome + "] ataca com arma: " + this.arma);
    }
}
