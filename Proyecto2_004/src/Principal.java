
public class Principal {
    // psvm + tab
    // main + tab
    public static void main(String[] args) {
        // creacion de objeto
        Pizza pizza1 = new Pizza();
        
        // ingresar datos al objeto
        pizza1.setNombre("Vegetaria");
        pizza1.setMasa("Delgada");
        pizza1.setTamano("Media");
        pizza1.setPrecio(10000);

        // mostrar los datos del objeto
        System.out.println("== Datos Pizza ==");
        System.out.println("Nombre  : " + pizza1.getNombre());
        System.out.println("Masa    : " + pizza1.getMasa());
        System.out.println("Tamano  : " + pizza1.getTamano());
        System.out.println("Precio  : " + pizza1.getPrecio());
        
        // Ejercicio:
        // Crear una segunda pizza y mostrar los datos
        
        Pizza pizza2 = new Pizza();
        
        // ingresar datos al objeto
        pizza2.setNombre("Hawaina");
        pizza2.setMasa("Normal");
        pizza2.setTamano("Familiar");
        pizza2.setPrecio(15000);

        // mostrar los datos del objeto
        System.out.println("== Datos Pizza ==");
        System.out.println("Nombre  : " + pizza2.getNombre());
        System.out.println("Masa    : " + pizza2.getMasa());
        System.out.println("Tamano  : " + pizza2.getTamano());
        System.out.println("Precio  : " + pizza2.getPrecio());
        
        Pizza pizza3 = new Pizza();
        
        // ingresar datos al objeto
        pizza3.setNombre("Radeo");
        pizza3.setMasa("borde queso");
        pizza3.setTamano("XL");
        pizza3.setPrecio(19000);
        
        pizza3.imprimirDatos();
        
        // Ejemplo de constructores
        // sin parametro
        Pizza pizza4 = new Pizza();
        pizza4.imprimirDatos();
        // con parametro
        Pizza pizza5 = new Pizza("Napolitana", "piedra", "personal", 8000);
        pizza5.setPrecio(7000);
        pizza5.imprimirDatos();
        
        // Ejercicio: Crear una pizza Pollo BBQ usando constructor con parametros
        // e imprimir los datos
     
        // LEE ppt 1.2.1
    }
}
