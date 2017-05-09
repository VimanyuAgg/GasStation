import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReceiptPrinter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiptPrinter extends Actor
{
    /**
     * Act - do whatever the ReceiptPrinter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GasPumpState gpState = GasPumpState.getInstance();
        // Add your action code here.
        World world = getWorld();
        if(gpState.getState() == State.isFilled){
            DisplayScreen ds1 = new DisplayScreen("Do you want to print Receipt ?");
            world.addObject(ds1,400,100);
            
            //If yes
            gpState.setState(State.isPrintReceipt);
        
        }
    }    
}
