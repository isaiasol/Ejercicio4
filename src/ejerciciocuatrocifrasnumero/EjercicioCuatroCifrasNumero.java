/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuatrocifrasnumero;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author OrtizL
 */
public class EjercicioCuatroCifrasNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor;
        System.out.println("Introduce un número de cinco cifras");
        Scanner teclado=new Scanner(System.in);
        valor = teclado.nextLine();
        String sCadena =valor;
        char[] aCaracteres = sCadena.toCharArray();
        int pos=0;
        StringBuffer cadena = new StringBuffer();
        if (aCaracteres.length==5 && valor.matches("[0-9]*")){
            for(int x=0;x<5;x++){
                System.out.println(cadena.append(aCaracteres[x]));
                pos=pos+1;
            }
        }
        else
        {
                System.out.println("El número introducido no es correcto");
        }
             
    }
    
}
