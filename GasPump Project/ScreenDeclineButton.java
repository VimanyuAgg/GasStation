import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class ScreenDeclineButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenDeclineButton  extends ScreenButtons
{
    World world = getWorld(); 
  //  rp.setPrintApproval();
     GasPumpState gpState = GasPumpState.getInstance();
    public void act() 
    {
        if(gpState.getState() == State.isCarWashSelected && Greenfoot.mousePressed(this)){
            gpState.setState(State.isValidatedButUnfueled);
        }
        // Add your action code here.
    } 
}
