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
public class Soy extends CondimentDecorator{
    
    Beverage Beverage;
    
    public Soy(Beverage beverage){
        this.Beverage = beverage;
    }

    @Override
    public String getDescription() {
        return Beverage.getDescription()+", " +" Soy ";
    }
    
    public double cost(){
        return .15 + Beverage.cost();
    }
    
}
