public class VeiculoTerrestre extends Veiculo {
    private int numeroRodas;

    public VeiculoTerrestre(int Ano, String Cor, String Modelo, boolean Ligado,int numeroRodas) {
        super(Ano, Cor, Modelo, Ligado);
        this.numeroRodas = numeroRodas;
    }
}
