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
public class Car {
       
    private String name;
    private Chassis chassis;
    private Tyres tyres;
    private Suspension suspension;
    private Engine engine;
    public int totalCost; 
    public int totalWeight;
    //private int index;
    
    public Car(String str, Chassis x, Tyres y, Suspension z, Engine v){
        name = str;
        chassis = x;
        tyres = y;
        suspension = z;
        engine = v;
       
        updateCost();
        
        totalWeight = chassis.getWeight() + tyres.getWeight() 
                    + suspension.getWeight() + engine.getWeight();
             
    }
    
    public Car(Car c)
    {
        this.name = c.name;
        this.chassis = c.chassis;
        this.tyres = c.tyres;
        this.suspension = c.suspension;
        this.engine = c.engine;
        this.totalCost = c.totalCost;
        this.totalWeight = c.totalWeight;
    }
    
     private void updateCost(){
        totalCost = chassis.getCost() + tyres.getCost() 
                    + suspension.getCost() + engine.getCost();
    }
    
    public void setName(String str){
        name = str;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getTotalCost(){
        return this.totalCost;
    }
    
    public int getTotalWeight(){
        return this.totalWeight;
    }
    
    public Chassis getChassis(){
        return chassis;  
    }
    
    public void setChassis(Chassis chassis){
        this.chassis = chassis;
        updateCost();
    }
    
    public Tyres getTyres(){
        return tyres;  
    }
    
    public void setTyres(Tyres tyres){
        this.tyres = tyres;
        updateCost();
    }
        
    public Suspension getSuspension(){
        return suspension;  
    }
    
    public void setSuspension(Suspension suspension){
        this.suspension = suspension;
        updateCost();
    }
        
    public Engine getEngine(){
        return engine;  
    }
    
    public void setEngine(Engine engine){
        this.engine = engine;
        updateCost();
    }
}
