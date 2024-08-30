
public class PrincipalSentenciaFor {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Valor de i: " + i);
        }
        int valor = 0;
        for(; valor < 10;)
        {
            System.out.println("valor:" + (++valor));
        }
        
    }
}
