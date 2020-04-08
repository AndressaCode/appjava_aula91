/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    
    public static void main(String[] args){
        
        String[] vect = new String[] {"Maria" , "Enzo" , "Andressa"};
        
        for(int i = 0; i<vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("---------------------------------------");
        for(String obj: vect){
            System.out.println(obj);
        }
    }
}
