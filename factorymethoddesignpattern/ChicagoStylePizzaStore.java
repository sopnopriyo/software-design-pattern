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
public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("chicago")){
            return new ChicagoPizza();
        }
        else{
            return null;
        }
    }
    
}
