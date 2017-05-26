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
public class Mocha extends CondimentDecorator{
    
    Beverage Beverage;
    
    public Mocha(Beverage beverage){
        this.Beverage=beverage;
    }

    @Override
    public String getDescription() {
        return Beverage.getDescription()+", " +" Mocha ";
    }
    
    public double cost(){
        return .20 + Beverage.cost();
    }
    
}
