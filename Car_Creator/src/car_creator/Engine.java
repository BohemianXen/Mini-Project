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
public class Engine extends Car_Parts {
    
    public int bhp;
   
    public Engine(int x, int y, int z){
        
        super(x,y);
        bhp = z;
    }
    
    public int getBHP(){
        return bhp;
    }
    
    public void setBHP(int bhp){
        this.bhp = bhp;
    }
}
