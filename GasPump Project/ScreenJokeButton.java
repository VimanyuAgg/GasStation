import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Prints random jokes to user - after validation
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenJokeButton extends ScreenButtons
{
    /**
     * . This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        GasPumpState gpState = GasPumpState.getInstance();
        
        if(gpState.getState() == State.isUnValidated && Greenfoot.mousePressed(this)){
        GreenfootSound gSound = new GreenfootSound("beepSound.wav");
        gSound.play();
        }
        else if(Greenfoot.mousePressed(this)){
            World world = getWorld();   
            world.removeObjects(getWorld().getObjects(DisplayScreen.class));
             DisplayScreen ds = new DisplayScreen("I am joking");
                world.addObject(ds,400,250);
        }
    }    
}
