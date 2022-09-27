/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contatenacion;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Contatenacion {
    static Scanner ent= new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca el Nombre:");
        String nom = ent.nextLine();
        System.out.println("Introduzca el Nombre:");
        String ape = ent.nextLine();
        System.out.println("Su nombre es "+nom+" con apellido "+ape);
        
    }
    
}
