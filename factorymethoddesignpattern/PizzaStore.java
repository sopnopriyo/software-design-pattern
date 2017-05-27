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
public abstract class PizzaStore {
    
    public Pizza  orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
    public abstract Pizza createPizza(String type);
    
}
