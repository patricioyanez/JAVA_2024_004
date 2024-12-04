
package controlador;

import java.util.ArrayList;
import modelo.Mecanico;

/**
 *
 * @author patri
 */
public class GestoraMecanico {
    static ArrayList<Mecanico> listado = new ArrayList<Mecanico>();
    public boolean agregar(Mecanico mecanico)
    {
        return listado.add(mecanico);
    }
    public Mecanico buscarPorRut(String rut)
    {
        for (Mecanico mecanico : listado) {
            if(mecanico.getRut().equalsIgnoreCase(rut))
                return mecanico;
        }
        return null;
    }
    
    public ArrayList<Mecanico> listarTodo()
    {
        return listado;
    }
    
    public boolean eliminarPorRut(String rut)
    {
        for (Mecanico mecanico : listado) {
            if(mecanico.getRut().equalsIgnoreCase(rut))
            {
                listado.remove(mecanico);
                return true;
            }
        }
        return false;
    }
}
