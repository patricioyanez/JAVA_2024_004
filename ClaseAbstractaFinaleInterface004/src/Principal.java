import java.util.ArrayList;
// ppt 211 , 221 y 231

public class Principal {

    public static void main(String[] args) {
        Ave pollo = new Ave();
        pollo.mover();
        
        Pez salmon = new Pez();
        salmon.mover();
        // Ejercicio 21: crear arrayList para guardar los peces y aves
        ArrayList<Animal> zoologico = new ArrayList<Animal>();
        zoologico.add(pollo);
        zoologico.add(salmon);
        System.out.println("\n======> Listado de animales");
        for (Animal animal : zoologico) {
            animal.mover();
            animal.guardar();
           
            if(animal instanceof Ave)
            {
                ((Ave) animal).comer();
            }
        }
        
    }
    
}
