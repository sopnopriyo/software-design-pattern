/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratordesignpattern;

/**
 *
 * @author Lenovo
 */
public class DecoratorDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage beverage1 = new Expresso();
        System.out.println(beverage1.getDescription()+
                " $ "+
                beverage1.cost());
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        
         System.out.println(beverage2.getDescription()+
                " $ "+
                beverage2.cost());
        
    }
    
}
