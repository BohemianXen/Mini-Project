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
public class Tyres extends Car_Parts {
    
    private int traction;
    
    public Tyres(int x, int y, int z){
        super(x,y);
        traction = z;
        
    }
    
    public int getTraction(){
        return traction;
    }
    
    public void setTraction(int traction){
        this.traction = traction;   
    }
    
}
