import java.util.Scanner;

public class PrincipalSentenciaSwitch {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        // ingresar solo notas enteras del 1 al 7
        System.out.print("Ingrese su nota: ");
        int nota = leerTeclado.nextInt();
        
        switch(nota)
        {
            case 1:
                System.out.println("Rendimiento es nulo");
                break;
            case 2:
                System.out.println("Rendimiento es muy bajo");
                break;
            case 3:
                System.out.println("Rendimiento es bajo");
                break;
            case 4:
                System.out.println("Rendimiento es básico");
                break;
            case 5:
                System.out.println("Rendimiento es intermedio");
                break;
            case 6:
                System.out.println("Rendimiento es bueno");
                break;
            case 7:
                System.out.println("Rendimiento es muy bueno");
                break;
            default:
                System.out.println("La nota no es valida");
        }
        
    }
}
