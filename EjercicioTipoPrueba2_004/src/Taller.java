import java.util.ArrayList;

public class Taller {
    private ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
    
    
    public boolean agregar(Vehiculo vehiculo)    
    {
        if(this.buscarPorPatente(vehiculo.getPatente()))
            return false;
        return listado.add(vehiculo);
    }
    
    public boolean buscarPorPatente(String patente)
    {
        for (Vehiculo vehiculo : listado) {
            if(vehiculo.getPatente().equalsIgnoreCase(patente))
                return true;
        }
        return false;
    }
    public void listar()
    {
        for (Vehiculo vehiculo : listado) {
            System.out.println(vehiculo);
        }
    }
    public void contabilizar()
    {
        int auto = 0;
        int moto = 0;
        for (Vehiculo vehiculo : listado) {
            if(vehiculo instanceof Auto)
                auto++;
            else
                moto++;
        }
        System.out.println("Contabilidar vehiculos");
        System.out.println("Auto:" + auto);
        System.out.println("Moto:" + moto);
    }
}
