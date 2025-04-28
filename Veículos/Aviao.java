public class Aviao extends VeiculoAereo {
    private float envergaduraAsa;
    private String tipoCombustivel;

    public Aviao(int ano, String cor, String modelo, boolean Ligado, int numeroMotores,
                 float envergaduraAsa, String tipoCombustivel) {

        super(ano, cor, modelo, Ligado, numeroMotores);
        this.envergaduraAsa = envergaduraAsa;
        this.tipoCombustivel = tipoCombustivel;
    }

    void decolar() {
        System.out.println("•••••••••••••••••••••••••••••");
        System.out.println("•O " + getModelo() + " acaba de decolar☻•");
    }

    void pousar() {

        System.out.println("•O " + getModelo() + " acaba de pousar☻•");
        System.out.println("••••••••••••••••••••••••••••");
    }
}
