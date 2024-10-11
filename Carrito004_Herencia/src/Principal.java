
public class Principal {


    public static void main(String[] args) {
        Electronico radio = new Electronico("Kioto", 12, "150", "Radio portatil", 20000);
        radio.extenderGarantia(6);
        Double precioPagar = radio.calcularDescuento(10.0);
        System.out.println(radio);
        System.out.println("Precio a pagar: " + precioPagar);

    }
    
}
