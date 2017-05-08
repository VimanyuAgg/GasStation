import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Premium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Premium extends FuelType
{
    /**
     * Act - do whatever the Premium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void displayMessage(){
           World world = getWorld();
           world.removeObjects(getWorld().getObjects(DisplayScreen.class));
           DisplayScreen ds = new DisplayScreen("You have selected Premium Fuel Type");
           
           world.addObject(ds,400,250);
    }
    
    public void act() 
    {
        GasPumpState gpState = GasPumpState.getInstance();
        // Add your action code here.
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
        int x= Greenfoot.getMouseInfo().getX();
        int y =Greenfoot.getMouseInfo().getY();
        //System.out.println("Inside premium act()");
        //Append this condition BELOW : gpState.getState() == State.isValidatedButUnfueled && 
            if(Greenfoot.mousePressed(null) && x < 398 && x > 335 && y>307 && y<393){
                this.displayMessage();
            
                gpState.setState(State.isFuelSelectedButUnfueled);
        
            }
        }
}
}
