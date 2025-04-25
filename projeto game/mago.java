public class Mago extends Personagem {

    Mago(String nome,String arma,int vida, int dano, String funcao){
        super(nome,arma,vida,dano,funcao);
    }
    @Override
   public void atacar(){
        System.out.println("| Mago [" + getNome() + "] ataca com arma: " + getArma());
        System.out.println("|O ataque foi feito com sucesso! " + getNome() + " atacou ");
    }
}
