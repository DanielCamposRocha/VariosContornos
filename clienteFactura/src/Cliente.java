import java.util.ArrayList;

public class Cliente {
    private final String nombre;
    private final String dni;
    private String cuenta;
    ArrayList <Factura> nombreArray;
    private static int idCliente;
    private final int numeroCliente;

    public Cliente(String nombre, String dni, String cuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuenta = cuenta;
        nombreArray = new ArrayList<>();
        idCliente++;
        this.numeroCliente=idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public ArrayList<Factura> getNombreArray() {
        return nombreArray;
    }

    public void setNombreArray(ArrayList<Factura> nombreArray) {
        this.nombreArray = nombreArray;
    }

    public static int getIdCliente() {
        return idCliente;
    }

    public static void setIdCliente(int idCliente) {
        Cliente.idCliente = idCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", cuenta='" + cuenta + '\'' +
                ", nombreArray=" + nombreArray +
                ", numeroCliente=" + numeroCliente +
                '}';
    }
}
