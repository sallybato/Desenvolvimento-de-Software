public class Personagem {

    private String nome;
    private String arma;
    private int vida;
    private String funcao;

    Personagem(String nome, String arma, int vida, float dano, String funcao){
        this.nome = nome;
        this.arma = arma;
        this.vida = vida;
        this.funcao = funcao;


    }

    public String getNome() {
        return nome;
    }

    public String getArma() {
        return arma;
    }

    public int getVida() {
        return vida;
    }
    public String getFuncao(){
        return funcao;
    }

    public void atacar(){
    }


    void receberdano(float dano) {
        this.vida -= dano;
        if (this.vida < 0)this.vida = 0;
            }

    public int valordano(){
        return 10;
    }

}

