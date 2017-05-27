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
public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        
        if(type.equalsIgnoreCase("Cheese")){
            return new NYStyleCheesePizza();
        }
        else {
            return null;
        }
    }
    
}
