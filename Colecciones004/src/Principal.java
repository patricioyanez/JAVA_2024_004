import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // crear coleccion arrayList para String
        ArrayList<String> nombres = new ArrayList<String>();
        
        // agregar elementos
        nombres.add("Francisca");
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Diego");
        
        int con = 0;
        for(String auxiliar : nombres)
        {
            con++;
            System.out.println("Nombre " + con + " : " + auxiliar);
        }
        
        // buscar
        boolean fueEncontrado = false;
        fueEncontrado = nombres.contains("Juan");
        if(fueEncontrado)
            System.out.println("Encontrado");
        else
            System.out.println("No encontrado");
        
        // mostrar elemento según indice
        System.out.println("indice 3: " + nombres.get(2) );
       
        // indice del elemento buscado
        nombres.add("Ana");
        int indice = nombres.indexOf("Adam");
        System.out.println("Indice 1ra coincidencia: " + indice);
        
        for(String aux: nombres)
        {
            System.out.println("===> " + aux);
        }
        // quitar elemento
        if(nombres.remove("Juan"))
            System.out.println("Juan fue Eliminado");
        else
            System.out.println("No fue eliminado");
        
        for(String aux: nombres)
        {
            System.out.println("===> " + aux);
        }
        
        // devuelve la cantidad de elementos de la colección
        System.out.println("Elementos: " + nombres.size());
    }
    
    // Ejercicio 30: crear una clase producto con 5 atributos
    // y agregar elementos a una colección.
    
    
}
