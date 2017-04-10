/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondesignpattern;

/**
 *
 * @author sopno
 */
public class ChocolateController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler  = ChocolateBoiler.getInstance();
       
        System.err.println("Is Empty : "+chocolateBoiler.isEmpty());
        
        System.err.println("Is boiled : "+chocolateBoiler.isBoiled());
    }
    
}
