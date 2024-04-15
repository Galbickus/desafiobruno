import java.util.Scanner;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        int opcion;


        do {
            System.out.println("Ingrese el límite de tarjeta: ");
            double limiteDeCompra = teclado.nextDouble();
            Tarjeta tarjeta = new Tarjeta(limiteDeCompra);

            System.out.println("Ingrese la descripción del producto: ");
            String descripcion = teclado.next();

            System.out.println("Ingrese el precio: ");
            double precio = teclado.nextDouble();

            if (limiteDeCompra < precio){
                System.out.println("Saldo insuficiente para esta compra.");
            }else {
                System.out.println("¡Compra realizada! ");
                Producto productoComprado = new Producto(descripcion, precio);
                limiteDeCompra -= precio;

            }



            System.out.println("Si desea salir ingrese 0, para continuar ingrese 1");
            opcion = teclado.nextInt();
        }while (opcion != 0);


    }
}
