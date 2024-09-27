import java.util.ArrayList;


public class Empresa {
    ArrayList<Empleado> empleados;
    
    public Empresa(){
        empleados = new ArrayList<Empleado>();
    }
    
    public boolean agregar(Empleado empleado)
    {
        return empleados.add(empleado);
    }
    public boolean buscar(String rut)
    {// for each
        for(Empleado empleado: empleados)
        {
            if(empleado.getRut().equals(rut))
                return true;
        }
        return false;
    }
    public void listar()
    {
        for(Empleado empleado: empleados)
        {
            System.out.println(empleado);
        }
    }
    public boolean eliminar(String rut)
    {// for each
        for(Empleado empleado: empleados)
        {
            if(empleado.getRut().equals(rut))
            {
                empleados.remove(empleado);
                return true;
            }
        }
        return false;
    }
}
