
public class Principal {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente(100, "juan", 30, 546540, "asdfasdfq@fasdfa.cl", true);
        
        Vehiculo v1 = new Vehiculo("fasdf", "Honda", 10, 50000, cliente1);
        
        System.out.println(v1.getCliente().imprimirDatos());
        
    }
    
}
