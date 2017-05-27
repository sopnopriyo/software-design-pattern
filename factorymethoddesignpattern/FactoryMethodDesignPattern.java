/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethoddesignpattern;

/**
 *
 * @author Lenovo
 */
public class FactoryMethodDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan Order a "+pizza.getName()+"\n");
        
        pizza  = chicagoStore.orderPizza("chicago");
        
        System.out.println("Joel ordered a "+pizza.getName()+"\n");
    }
    
}
