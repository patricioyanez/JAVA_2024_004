
public class Principal {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto(5, 150, "qwer12", "Ana", 20000, 2380, 22380);
        Moto moto1 = new Moto("sPort", 50, "qw9865", "Diego", 10000, 1190, 11900);
        Moto moto2 = new Moto("sPort", 50, "qw9867", "Luis", 10000, 1190, 11900);
        
        Taller taller = new Taller();
        taller.agregar(auto1);
        taller.agregar(moto1);
        taller.agregar(moto2);
        
        auto1.obtenerDescuento();
        auto1.totalConIVA();
        auto1.totalPorPagar();
        
        System.out.println(auto1);
        
        System.out.println("==== Listado de Vehiculos ====");
        taller.listar();
        
        System.out.println("");
        taller.contabilizar();
        
        
    }
    
}
