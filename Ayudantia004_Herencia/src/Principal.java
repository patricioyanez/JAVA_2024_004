    /*
    Crear las clases Producto con los atributos: id, nombre, marca y precio. 
    Adicionalmente
    2 Subclases Teclado ( cantidad de teclas y si es mecanico) y Mouse 
    (cantidad de botones y si es optico).
    
    
        Ejercicio 1: Crear un objeto teclado, completar con
    datos y mostrarlos en la consola.
    
        Ejercicio 2: Crear la clase Mouse. Heredar de la clase
    Producto y agregar los atributos: esOptico y botones.
    
        Ejercicio 3: Crear un objeto mouse, completar con 
    datos y mostrarlos en la consola.
    
        Ejercicio 4: Crear un nuevo teclado y solicitar los
    datos por teclado. (usar Scanner)
    
    Leer ppt 2.1.1 y 2.2.1
    
    */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado(105, true, 10, "teclado español", "Genius", 5000);
        Mouse mouse1 = new Mouse(2, false, 50, "Mouse retro", "reteo", 500);
        System.out.println(teclado1);
        System.out.println(mouse1);
    }
    
}
