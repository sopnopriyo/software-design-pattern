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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
       
        mallardDuck.performQuack();
        
        mallardDuck.performFLy();
        
        //cannot fly after certain time then
        
        mallardDuck.setFlyBehaviour(new FlyWithoutWings());
        
        mallardDuck.performFLy();
    }
    
}
