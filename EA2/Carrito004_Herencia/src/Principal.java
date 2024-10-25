
import java.util.ArrayList;


public class Principal {


    public static void main(String[] args) {
        Electronico radio = new Electronico("Kioto", 12, "150", "Radio portatil", 20000);
        radio.extenderGarantia(6);
        Double precioPagar = radio.calcularDescuento(10.0);
        System.out.println(radio);
        System.out.println("Precio a pagar: " + precioPagar);
        System.out.println("=========== polera");
        Ropa polera = new Ropa("xl", "Rosa", "10", "Polera polo", 5000);
        polera.ajustarTalla("ss");
        polera.ajustarTalla("m");
        precioPagar = polera.calcularDescuento(15.0);
        System.out.println(polera);
        System.out.println("Precio a pagar: " + precioPagar);
        
        ArrayList<Producto> pedido = new ArrayList<Producto>();
        
        pedido.add(polera);
        pedido.add(radio);
        
        
        System.out.println("***** Pedido");
        for (Producto producto : pedido) {
            System.out.println(producto);
        }
        
    }
    
}
