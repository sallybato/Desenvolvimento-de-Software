public class Personagem {

    private String nome;
    private String arma;
    private int vida;
    private String funcao;
    private int dano;

    Personagem(String nome, String arma, int vida, int dano, String funcao){
        this.nome = nome;
        this.arma = arma;
        this.vida = vida;
        this.dano = dano;
        this.funcao = funcao;



    }

    public int getDano() {
        return dano;
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


    void receberdano(int dano) {
        this.vida -= dano;
        if (this.vida < 0)this.vida = 0;
    }

}
