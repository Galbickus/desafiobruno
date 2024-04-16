import java.util.*;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        double sumaDeCompras = 0;
        int opcion;
        List<Producto> listaDeCompras = new ArrayList<>();
        System.out.println("Ingrese el límite de tarjeta: ");
        double limiteDeCompra = teclado.nextDouble();
        Tarjeta tarjeta = new Tarjeta(limiteDeCompra);

        do {

            System.out.println("Ingrese la descripción del producto: ");
            String descripcion = teclado.next();

            System.out.println("Ingrese el precio: ");
            double precio = teclado.nextDouble();

            Producto productoAComprar = new Producto(descripcion, precio);
            boolean autorizacion = tarjeta.autorizarCompra(productoAComprar);

            if (autorizacion){

                System.out.println("¡Compra realizada! ");
                tarjeta.pagar(precio);
                listaDeCompras.add(productoAComprar);

            }else {
                System.out.println("Saldo INSUFICIENTE para este producto.");

            }

            System.out.println("Si desea salir ingrese 0, para continuar ingrese 1");
            opcion = teclado.nextInt();
        }while (opcion != 0);

        System.out.println("*****   S A L D O   *****\n");
        System.out.println("$ " + tarjeta.getLimiteDeCompra());
        System.out.println("\n*****   DETALLE DE COMPRAS (ordenados del más barato al más caro)   *****\n");
        Collections.sort(tarjeta.getListaDeCompra());

        for (Producto producto:tarjeta.getListaDeCompra()){
            System.out.println("-"+ producto.getDescripcion() + ": $ " + producto.getPrecio() + ".");
            sumaDeCompras += producto.getPrecio();
        }
        System.out.println("-Monto total de consumos: $ " + sumaDeCompras + ".");
    }
}
