import java.util.*;

public class Tarjeta {
   private double limiteDeCompra;
   private double saldo;

   private List<Producto>listaDeCompra;

   /*OJO Bruno instancia el Array en el constructor*/

   public Tarjeta(double limiteDeCompra) {
      this.limiteDeCompra = limiteDeCompra;
      this.saldo = limiteDeCompra;
      this.listaDeCompra = new ArrayList<>();
   }

   public boolean autorizarCompra(Producto producto){
      if(this.saldo >= producto.getPrecio()){
         this.saldo -= producto.getPrecio();
         this.listaDeCompra.add(producto);
         return true;
      }
      return false;
   }

   public double getLimiteDeCompra() {
      return limiteDeCompra;
   }

   public double getSaldo() {
      return saldo;
   }

   public List<Producto> getListaDeCompra() {
      return listaDeCompra;
   }

   public void pagar(double precioDeCompra){
      this.limiteDeCompra-=precioDeCompra;
   }

   @Override
   public String toString() {
      return  "Saldo: $ " + limiteDeCompra;
   }
}
