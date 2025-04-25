public class VeiculoAquatico extends Veiculo{
    private float comprimento;

    public VeiculoAquatico(int ano, String cor,String modelo,boolean Ligado, float comprimento) {
        super(ano,cor,modelo,Ligado);
        this.comprimento = comprimento;

    }
}
