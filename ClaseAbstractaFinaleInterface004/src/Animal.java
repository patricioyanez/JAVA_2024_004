
public abstract class Animal implements IOperaciones {
    private int cantidadOjos;
    private int cantidadPatas;
    private String sonidoQueEmite;

    public Animal() {
        this.cantidadOjos = 0;
        this.cantidadPatas = 0;
        this.sonidoQueEmite = "";
    }
    public Animal(int cantidadOjos, int cantidadPatas, String sonidoQueEmite) {
        this.cantidadOjos = cantidadOjos;
        this.cantidadPatas = cantidadPatas;
        this.sonidoQueEmite = sonidoQueEmite;
    }

    public String getSonidoQueEmite() {
        return sonidoQueEmite;
    }

    public void setSonidoQueEmite(String sonidoQueEmite) {
        this.sonidoQueEmite = sonidoQueEmite;
    }

    public int getCantidadOjos() {
        return cantidadOjos;
    }

    public void setCantidadOjos(int cantidadOjos) {
        this.cantidadOjos = cantidadOjos;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    @Override
    public String toString() {
        return  "\nCantidad de Ojos = " + cantidadOjos + 
                "\nCantidad de Patas= " + cantidadPatas + 
                "\nSonido Que Emite = " + sonidoQueEmite;
    }
    
    public abstract void mover();

}
