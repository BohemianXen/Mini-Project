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
public class Suspension extends Car_Parts {
    
    public int height;
    
    public Suspension(int x, int y, int z){
        
        super(x,y);
        height = z;
        
    }
    
    public int getHeight(){
        return height;
    }
    
    public void setHeight(int height){
       this.height = height;
    } 
}
