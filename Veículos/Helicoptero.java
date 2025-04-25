public class Helicoptero extends VeiculoAereo{
    private int numeroHelices;
    private float capacidadeCarga;

    public Helicoptero(int ano, String cor, String modelo, boolean Ligado,
                       int numeroMotores, float capacidadeCarga) {

        super(ano, cor, modelo, Ligado,numeroMotores);
        this.capacidadeCarga = capacidadeCarga;
    }
    void pairar(){
        System.out.println("••••••••••••••••••••••••••••••••••••••••••••••");
        System.out.println("•O" + getModelo() + "esta pairando sobre o ar•");
        System.out.println("••••••••••••••••••••••••••••••••••••••••••••••");
    }
    void resgatarPessoas(){
        System.out.println("••••••••••••••••••••••••••••••••••••••••••••••");
        System.out.println("•O" + getModelo() + "esta resgatando pessoas!•");
        System.out.println("••••••••••••••••••••••••••••••••••••••••••••••");
    }
}
