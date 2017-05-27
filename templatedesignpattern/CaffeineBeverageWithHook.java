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
public abstract class CaffeineBeverageWithHook {
        
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsConfiments()){
            addCondiments();
        }
    }
    
    public abstract void brew();
    
    public abstract void addCondiments();
    
    public void boilWater(){
        System.out.println("Boiling water");
    }
    
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
    boolean customerWantsConfiments(){
        return false;
    }
}
