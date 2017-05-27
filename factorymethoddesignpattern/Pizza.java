/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethoddesignpattern;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public abstract class Pizza {
    
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();
    
    public void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dought ...");
        System.out.println("Adding sauce...");
        System.out.print("Adding toppings : ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.print(""+toppings.get(i));
        }
    }
    
    public void bake(){
        System.out.println("Bake for 25 minutes");
    }
    
    public void cut(){
        System.out.println("Cutting the pizza into diagonial sizes");
    }
    
    public void box(){
        System.out.println("Place pizza into official pizza store box");
    }
    
    public String getName(){
        return name;
    }
    
}
