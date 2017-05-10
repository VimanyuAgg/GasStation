/**
 * Write a description of class PrintApprovalEvent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintApprovalEvent implements Component
{
  public void startEvent(){
      GasPumpState gpState = GasPumpState.getInstance();
      
        ReceiptPrinter rp = GasPumpWorld.gpWorld.getObjects(ReceiptPrinter.class).get(0);
        rp.setPrintApproval();
        
        GasPumpWorld.gpWorld.removeOjects(GasPumpWorld.gpWorld.getObjects(DisplayScreen.class);
        DisplayScreen ds1 = new DisplayScreen("Do you want to print Receipt ?");
        GasPumpWorld.gpWorld.addObject(ds1,400,100);
        
      
  }
}
