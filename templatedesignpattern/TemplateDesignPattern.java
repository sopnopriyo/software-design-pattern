/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatedesignpattern;

/**
 *
 * @author Lenovo
 */
public class TemplateDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CaffeineBeverage teaBeverage = new Tea();
        teaBeverage.prepareRecipe();
        
        System.out.println("");
        CaffeineBeverageWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
        
    }
    
}
