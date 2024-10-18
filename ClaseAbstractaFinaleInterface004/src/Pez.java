
public class Pez extends Animal{

    @Override
    public void mover() {
        System.out.println("El pez NADA");
    }

    @Override
    public int guardar() {
        System.out.println("El pez fue guardado...");
        return 1;
    }

    @Override
    public void limpiar() {
        System.out.println("El objeto pez está limpio");
    }
    
}
