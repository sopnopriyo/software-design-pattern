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
public class Whip extends CondimentDecorator{
    
    Beverage Beverage;
    
    public Whip(Beverage beverage){
        this.Beverage = beverage;
    }

    @Override
    public String getDescription() {
        return Beverage.getDescription()+", " +" Whip ";
    }
    
    public double cost(){
        return .10 + Beverage.cost();
    }
    
}
