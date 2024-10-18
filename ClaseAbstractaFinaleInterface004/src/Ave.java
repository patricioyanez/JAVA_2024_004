
public final class Ave extends Animal{

    @Override
    public void mover() {
        System.out.println("El ave vuela");
    }
    
    public void comer()
    {
        System.out.println("El ave come insectos");
    }

    @Override
    public int guardar() {
        System.out.println("El ave fue guardada...");
        return 1;
    }

    @Override
    public void limpiar() {
        System.out.println("Los datos del ave fueron limpiados");
    }
 
}
