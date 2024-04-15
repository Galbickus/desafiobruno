import java.util.ArrayList;
import java.util.List;

public class Resumen{
    private List listaDeCompras;

    public Resumen(List<Producto> listaDeCompras) {
        this.listaDeCompras = (ArrayList) listaDeCompras;
    }

    public void agregarProductos(Producto producto){
        listaDeCompras.add(producto);
    }

}
