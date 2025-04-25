public class VeiculoAereo extends Veiculo{
   private int numeroMotores;

   public VeiculoAereo(int ano, String cor, String modelo, boolean Ligado,int numeroMotores) {
      super(ano, cor, modelo, Ligado);
      this.numeroMotores = numeroMotores;
   }


}
