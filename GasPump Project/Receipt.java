import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;
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
            //System.out.println("Inside receipt act");

            //get price
            //get price + Carwash Price <---need to print sum
            //boolean of carwash scenario
            DecimalFormat df = new DecimalFormat("0.00");
            Nozzle noz = world.getObjects(Nozzle.class).get(0);
            DisplayScreen ds1 = new DisplayScreen("Thanks for\n your visit !");
            DisplayScreen ds2_withoutCarwash = new DisplayScreen("Bill Details:\n "+"GAS BILL: $"+df.format(noz.getCurrentBill()));
            DisplayScreen ds3_CarwashDetails = new DisplayScreen("CARWASH DISCOUNT 10%");
            DisplayScreen ds3_finalBill = new DisplayScreen("Final Bill: $"+df.format((noz.getCurrentBill()*0.9)));
            ScreenOKButton cwStatus = world.getObjects(ScreenOKButton.class).get(0);
        ReceiptPrinter rp = world.getObjects(ReceiptPrinter.class).get(0);
         if(rp.getPrintApprovalStatus()){
                world.removeObjects(getWorld().getObjects(DisplayScreen.class));
                world.addObject(ds1,550,368);
                world.addObject(ds2_withoutCarwash,550,440);
                System.out.print("Car wash status "+cwStatus.getCarWashSelectedStatus());
                if(cwStatus.getCarWashSelectedStatus()){
                    world.addObject(ds3_CarwashDetails,550,510);
                    world.addObject(ds3_finalBill,550,520);
                }
                
                //world.addObject(ds1,550,450);
            }
           
        }
    }    
}
