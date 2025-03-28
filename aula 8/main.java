import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {

      Player Jogador = new Player(2,2);
      List<Player> jogadores = new ArrayList<>();

      jogadores.add(new Player(1,2));
      jogadores.add(new Player(3,2));


        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 5; coluna++){

                if(linha == Jogador.x && coluna == Jogador.y){
                    System.out.print("[ x ]");

                }
                else{
                    System.out.print("[ . ]");
                }
            }
            System.out.println();
    }


    }
}
