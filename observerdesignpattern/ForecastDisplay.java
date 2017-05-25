/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

/**
 *
 * @author Lenovo
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData; 
 
    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);  } 
 
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;   currentPressure = pressure; 
 
        display();  
    } 
 
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");   
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");   
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");   
        }  
    } 
} 
