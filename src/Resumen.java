import java.util.ArrayList;

public class Resumen implements Comparable<Producto> {
    private ArrayList listaDeCompras;

    public Resumen(ArrayList listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }

    public void agregarProductos(Producto producto){
        listaDeCompras.add(producto);
    }



    @Override
    public int compareTo(Producto o) {
        return 0;
    }
}
