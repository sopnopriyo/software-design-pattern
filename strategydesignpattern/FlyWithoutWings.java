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
public class FlyWithoutWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I am not flying");
    }
    
}
