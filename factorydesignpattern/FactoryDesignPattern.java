/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FactoryDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int typePizza;
         String type="";
        System.out.println("Welcome to ParadisePizzaShop.Please Choose type of pizza");
        System.out.println("1.Cheese Pizza\n2.Veggie Pizza\n3.Pepperoni Pizza\n4.Clam Pizza");
        typePizza = input.nextInt();
        
        if( typePizza == 1){
            type = "cheese";   
        }if( typePizza == 2){
            type = "veggie";   
        }
        if( typePizza == 3){
            type = "pepperoni";   
        }
        if( typePizza == 4){
            type = "clam";   
        }
        
        
        Pizza mypizza = null;
      PizzaStore pizza = new PizzaStore();
      mypizza =  pizza.orderPizza(type);
      System.out.println("We ordered a " + mypizza.getName());
      System.out.println(mypizza);
    }
    
}
