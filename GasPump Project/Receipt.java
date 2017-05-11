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
            System.out.println("Inside receipt act");

            //get price
            //get price + Carwash Price <---need to print sum
            //boolean of carwash scenario
            Nozzle noz = world.getObjects(Nozzle.class).get(0);
            DisplayScreen ds1 = new DisplayScreen("Thanks for your visit !");
            DisplayScreen ds2_withoutCarwash = new DisplayScreen("Bill Details:\n "+"GAS BILL: $"+noz.getCurrentBill());
            DisplayScreen ds3_CarwashDetails = new DisplayScreen();

        ReceiptPrinter rp = world.getObjects(ReceiptPrinter.class).get(0);
         if(rp.getPrintApprovalStatus()){
                world.removeObjects(getWorld().getObjects(DisplayScreen.class));
                world.addObject(ds1,550,450);
                world.addObject(ds2_withoutCarwash,550,500);
                //world.addObject(ds1,550,450);
            }
           
        }
    }    
}
