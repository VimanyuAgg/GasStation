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
    
    private boolean isWorking = false;
    private boolean printApproval =false;
    
    public void setPrintApproval(){
    printApproval = true;
    
    }
    
    public boolean getPrintApprovalStatus(){
    return printApproval;
    
    }
    public void setToWorkingState(){
        isWorking = true;
    }
    
    public boolean isWorking(){
    
        return isWorking;
    }
    
    private void startPrintingReceipt(){
    GasPumpState gpState = GasPumpState.getInstance();
        // Add your action code here.
        World world = getWorld();
        if(gpState.getState() == State.isFilled){
            if (!printApproval){
            DisplayScreen ds1 = new DisplayScreen("Do you want to print Receipt ?");
            world.addObject(ds1,400,100);
            }
            
            //If yes
            gpState.setState(State.isPrintReceipt);
        
        }
    
    }
    public void act() 
    {
        if (isWorking){
           startPrintingReceipt();
        }
        else{
        GreenfootSound gSound = new GreenfootSound("beepSound.wav");
        gSound.play();
        }
    }    
}
