public class Veiculo {

    private int ano;
    private String cor;
    private String modelo;
    protected boolean Ligado;

    public Veiculo(int Ano,String Cor, String Modelo, boolean Ligado) {
        this.ano = Ano;
        this.cor = Cor;
        this.modelo = Modelo;
        this.Ligado = Ligado;
    }

    public int getAno() {
        return ano;
    }

    public String setCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }


    public void setLigado(boolean ligado) {
        Ligado = ligado;
    }
    public boolean Ligado(){
        return Ligado;
}
    void ligar() {
        if (!this.isLigado()) {
            System.out.println("O veículo está ligado!");
            setLigado(true);
        }else{
            System.out.println("porra! O "+ getModelo()+ " ja ta ligado ♥");
        }


    }

    public boolean isLigado() {
        return Ligado;
    }

    void desligar(){
        if(this.isLigado()){
            System.out.println("O veículo esta desligado!");
            setLigado(false);
        }


    }
}
