/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

/**
 *
 * @author user
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza(){
    name = "Veggie Pizza";
    dough = "Crust";
    sauce = "Marinara saurce";
    toppings.add("Shredded Mozzarella");
    toppings.add("Granted Parmesan");
    toppings.add("Diced Onion");
    toppings.add("Sliced Mushroom");
    toppings.add("Sliced red pepper");
    toppings.add("Sliced black olives");
    
    
    }
    
}
