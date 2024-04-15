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

   public void pagar(double precioDeCompra){
      this.limiteDeCompra-=precioDeCompra;
   }

   @Override
   public String toString() {
      return  "Saldo: $ " + limiteDeCompra;
   }
}
