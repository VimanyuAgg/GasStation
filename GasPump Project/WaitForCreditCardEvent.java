/**
 * Write a description of class WaitForCreditCardEvent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import greenfoot.*;
public class WaitForCreditCardEvent implements Component
{
    // instance variables - replace the example below with your own
  
    public void startEvent(){
       CardSlot cardSlot = GasPumpWorld.gpWorld.getObjects(CardSlot.class).get(0);
       cardSlot.setToWorkingState();

        
        
    
    }
}
