
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = 0;
        Vehiculo vehiculo = new Vehiculo();
        Cliente cliente = new Cliente();
        
        while(true)
        {
            System.out.println("===== Menú =======");
            System.out.println("1.- Crear los datos");
            System.out.println("2.- Mostrar datos");
            System.out.println("3.- Agregar costo de servicio y descuento");
            System.out.println("4.- Enviar correo");
            System.out.println("5.- Salir");
            System.out.print("Ingresar opción: ");
            opcion = leerTeclado.nextInt();
            
            if(opcion == 1)
            {
                System.out.println("====== Crear datos ======");
                cliente.setRut(100001);
                cliente.setNombre("Ana");
                cliente.setCodigo(32);
                cliente.setTelefono(798798746);
                cliente.setCorreo("fasdfa@fasdgad.cl");
                cliente.setEsNuevo(false);
                
                vehiculo.setPatente("fasd65");
                vehiculo.setMarca("KIA");
                vehiculo.setKilometraje(150000);
                vehiculo.setPrecioServicio(0);
                vehiculo.setCliente(cliente);
                System.out.println("******  Datos guardados ******");
            }
            else if(opcion == 2)
            {
                System.out.println("====== Mostrar datos ======");
                System.out.println(vehiculo.imprimirDatos());
            }
            else if(opcion == 3)
            {
                System.out.println("====== Costo del servicio ======");
                System.out.print("Ingrese costo del servicio: ");
                int costo = leerTeclado.nextInt();
                vehiculo.setPrecioServicio(costo);
                vehiculo.descuento();
                System.out.println("====> Total a pagar: $" + vehiculo.getPrecioServicio());
                
            }
            else if(opcion == 4)
            {
                System.out.println("====== Envio de correo ======");
                vehiculo.enviarCorreo();
                System.out.println("====> Correo enviado");
            }
            else if(opcion == 5)
            {
                break;
            }
            else
            {
                System.out.println("=====> Opción ingresada no es válida");
            }
            System.out.println("Presione C para continuar");
            leerTeclado.next();
        }
    }
    
}
