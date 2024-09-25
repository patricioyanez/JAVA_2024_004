import java.util.ArrayList;

public class Principal {

    
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        String nombre1 = "Luis";
        String nombre2 = new String("Adams");
        
        nombres.add("Ana");
        nombres.add(nombre1);
        nombres.add(nombre2);
        
        for(String nombre: nombres)
        {
            System.out.println("Nombre: " + nombre.toUpperCase() );
        }
        
    }
    
}
