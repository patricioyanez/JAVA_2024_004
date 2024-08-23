
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
    }
}
