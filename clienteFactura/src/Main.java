public class Main {
    public static void main(String[] args) {
        Cliente dani=new Cliente("Dani","321654AS","A2");
        Factura pr=Factura.nuevaFactura("Pendrive",42.15,dani);
        Factura seg=Factura.nuevaFactura("SSD",150.58,dani);
        System.out.println(dani);
    }
}