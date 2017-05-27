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
public class Coffee extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Dripping  Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and  Milk");
    }
    
}
