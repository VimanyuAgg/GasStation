import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Receipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receipt extends Actor
{
    /**
     * Act - do whatever the Receipt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GasPumpState gpState = GasPumpState.getInstance();
        World world = getWorld();
        if(gpState.getState() == State.isPrintReceipt){
            Receipt receipt = new Receipt();
            //get price
            //get price + Carwash Price <---need to print sum
            //boolean of carwash scenario
            
            DisplayScreen ds1 = new DisplayScreen("Thanks for your visit !");
            DisplayScreen ds2_withoutCarwash = new DisplayScreen("Bill Details: "+"");
            DisplayScreen ds3_CarwashDetails = new DisplayScreen();

        ReceiptPrinter rp = world.getObjects(ReceiptPrinter.class).get(0);
         if(rp.getPrintApprovalStatus()){
                world.addObject(new Receipt(), 617, 843);
                world.addObject(ds1,400,100);
            }
           
        }
    }    
}
