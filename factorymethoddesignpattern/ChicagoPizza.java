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
public class ChicagoPizza extends Pizza{
    
    public ChicagoPizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    
    @Override
    public void cut(){
        System.out.println("Cutting the pizza into sqare slices");
    }
    
}
