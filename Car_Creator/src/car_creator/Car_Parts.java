/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_creator;

/**
 *
 * @author blaze
 */
public abstract class Car_Parts {
    
    private int cost; 
    private int weight;
    //T type; 
    
    public Car_Parts(int x, int y){
        
        cost = x; 
        weight = y;
        
    }
    
    public int getCost(){
        return cost;
    }
    
    public void setCost(int cost){
        this.cost = cost;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public void setWeight(int weight){
        this.weight = weight;
    }
    
    //public abstract void move();
        
}
