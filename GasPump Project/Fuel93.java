import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Premium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fuel93 extends FuelType
{
    /**
     * Act - do whatever the Premium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void displayMessage(){
           World world = getWorld();
           world.removeObjects(getWorld().getObjects(DisplayScreen.class));
           DisplayScreen ds = new DisplayScreen("You have selected Premium Fuel Type");
           DisplayScreen ds2 = new DisplayScreen("Please start filling your tank");
           
           world.addObject(ds,400,250);
           world.addObject(ds2,400,350);
    }
    
    public void act() 
    {
        if(isWorking){
        GasPumpState gpState = GasPumpState.getInstance();
        // Add your action code here.
        if(gpState.getState() == State.isValidatedButUnfueled && Greenfoot.mousePressed(this)){
                this.displayMessage();
                System.out.println("Inside Fuel93 - Setting the state to isFuelSelectedButUnfueled");
                gpState.setState(State.isFuelSelectedButUnfueled);
        
        
        }
       }
        else if(Greenfoot.mousePressed(this)){
            System.out.println("Fuel93 Status: "+isWorking);
        GreenfootSound gSound = new GreenfootSound("beepSound.wav");
        gSound.play();
        }
        
        }
}

