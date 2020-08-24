/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseobjeto;

/**
 *
 * @author Valmore
 */
public class Persona {
    String Name;
    int Age;
    
    public void myname (String Name){
        System.out.println("Hola:  " + Name + " Bienvenido");
    }
    public void myage (int varAge){
        Age = 2020 - varAge;
        System.out.println("Naciste en el Año :  " + Age);
    }
    
}
