/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

/**
 *
 * @author patri
 */
public class Validacion {
    
    public static boolean soloLetras(String texto)
    {
        if(texto == null || texto.isEmpty())
            return false;
        return texto.matches("[a-zA-Z áéíóúÁÉÍÓÚ´Ññ]+");
    }
        
    public static boolean soloNumero(String texto)
    {
        if(texto == null || texto.isEmpty())
            return false;
        return texto.matches("\\d+");
    }     
    public static boolean soloNumeroyLetras(String texto)
    {
        if(texto == null || texto.isEmpty())
            return false;
        return texto.matches("[a-zA-Z0-9 áéíóúÁÉÍÓÚ´Ññ]+");
    }
    
}
