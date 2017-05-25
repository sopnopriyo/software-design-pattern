/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydesignpattern;

/**
 *
 * @author Lenovo
 */
public abstract class Duck {
    
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    
    public Duck(){}
    
    public void performFLy(){
        flyBehaviour.fly();
    }
    
    public void performQuack(){
        quackBehaviour.quack();
    }
    
    public void swim(){
        System.out.println("All duck can float");
    }
    
      
    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    
    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }
    
}
