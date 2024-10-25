
public class Principal {

    public static void main(String[] args) {
        Puesto puesto1 = new Puesto(10, "Gerente");
        Puesto puesto2 = new Puesto(15, "Supervisor");
        
        Empleado empleado1 = new Empleado("1-9", "Juan", "H", 10, 40, puesto1);
        Empleado empleado2 = new Empleado("2-7", "Ana", "M", 5, 35, puesto2);
        
        Empresa empresa = new Empresa();
        
        if(empresa.buscar("1-9"))
        {
            System.out.println("El empleado ya esta registrado");
        }
        else
        {            
            empresa.agregar(empleado1);           
            System.out.println("Empleado " + empleado1.getNombre() + " guardado"); 
        }
        
        empresa.agregar(empleado2);
        
        empresa.listar();
    }
    
}
