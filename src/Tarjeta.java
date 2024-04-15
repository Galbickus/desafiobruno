public class Tarjeta {
   private double limiteDeCompra;

   public Tarjeta(double limiteDeCompra) {
      this.limiteDeCompra = limiteDeCompra;
   }

   public double getLimiteDeCompra() {
      return limiteDeCompra;
   }

   public void setLimiteDeCompra(double limiteDeCompra) {
      this.limiteDeCompra = limiteDeCompra;
   }

   @Override
   public String toString() {
      return  "Saldo: $ " + limiteDeCompra;
   }
}
