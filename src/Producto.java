public class Producto implements Comparable<Producto>{
    private String descripcion;
    private double precio;

    public Producto(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    /*Casteo a objeto clase wrapper para obtener superpoderes, entre ellos value of*/
    @Override
    public int compareTo(Producto o) {
        return Double.valueOf(this.precio).compareTo(Double.valueOf(o.getPrecio()));
    }

    @Override
    public String toString() {
        return descripcion + ", precio: $ " + precio;
    }
}
