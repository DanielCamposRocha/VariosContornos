public class Factura {

    private static int idFactura;
    private final String productos;
    private final double total;
    private final int numeroFactura;
    private final int numeroCliente;

    private Factura(String productos, double total, int numeroCliente) {
        this.productos = productos;
        this.total = total;
        idFactura++;
        this.numeroFactura = idFactura;
        this.numeroCliente=numeroCliente;
    }

    public static int getIdFactura() {
        return idFactura;
    }

    public static void setIdFactura(int idFactura) {
        Factura.idFactura = idFactura;
    }

    public String getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    @Override
    public String toString() {
        return "\nFactura{" +
                "productos='" + productos + '\'' +
                ", total=" + total +
                ", numeroFactura=" + numeroFactura +
                ", numeroCliente=" + numeroCliente +
                '}';
    }

    public static Factura nuevaFactura(String productos, double total, Cliente cliente){
        Factura f=new Factura(productos,total,cliente.getNumeroCliente());
        cliente.nombreArray.add(f);
        return f;
    }
}
