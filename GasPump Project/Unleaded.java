import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Unleaded here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Unleaded extends FuelType
{
    /**
     * Act - do whatever the Unleaded wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void displayMessage(){
           World world = getWorld();
           world.removeObjects(getWorld().getObjects(DisplayScreen.class));
           DisplayScreen ds = new DisplayScreen("You have selected Unleaded Fuel Type");
           
           world.addObject(ds,100,250);
    }
    
    public void act() 
    {
        GasPumpState gpState = GasPumpState.getInstance();
        // Add your action code here.
        if(gpState.getState() == State.isValidatedButUnfueled && Greenfoot.mousePressed(this)){
            this.displayMessage();
                        gpState.setState(State.isFuelSelectedButUnfueled);
        
        }
    }    
}
