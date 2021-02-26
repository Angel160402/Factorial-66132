/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.pkg66132;

/**
 *
 * @author User
 */
public class Factorial66132 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ANGEL GABRIEL MANRERO HIDALGO
        double contador = 1;
        double numero = 15;

        while (numero != 0) {
            contador = contador * numero;
            numero--;
        }

        System.out.println("El resultado es : " + contador);
    }

}
