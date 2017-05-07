import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisplayScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayScreen extends Actor
{
    /**
     * Act - do whatever the DisplayScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GasPumpState gpState = null;
    
        
    public void act() 
    {
        // Add your action code here.
        World world = getWorld();
        
    
        switch (gpState.getState()){
            case isUnValidated:
                String
                setImage(new GreenfootImage(str, 24, Color.BLACK, Color.WHITE));    
                break;
               
        
        } 
            
        
    }    
}
