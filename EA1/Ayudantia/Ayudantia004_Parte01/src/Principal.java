
public class Principal {

    public static void main(String[] args) {
        Componente procesador = new Componente(10, "intel", "i9", "Procesador 7ta G", 150000);
        Componente memoria = new Componente(12, "Kingtons", "ddr5", "Memoria 64GB", 120000);
        Componente ssd = new Componente(15, "WD", "dfgsdf", "SSD 960GB", 100000);
        
        Cliente cliente1 = new Cliente("1-9", "Juan", "Diaz", "Vespucio 1501", "juan@mail.com", 30);
        Cliente cliente2 = new Cliente("2-7", "Ana", "Aros", "Vespucio 1703", "ana@mail.com", 35);
        
        System.out.println("Listado de componentes");
        System.out.println(procesador.imprimirDatos());
        System.out.println(memoria.imprimirDatos());
        System.out.println(ssd.imprimirDatos());
        System.out.println("Listado de Clientes");
        System.out.println(cliente1.imprimirDatos());
        System.out.println(cliente2.imprimirDatos());
    }
    
}
