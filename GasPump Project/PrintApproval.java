/**
 * Write a description of class PrintApprovalEvent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintApproval implements Component
{
  public void startEvent(){
      GasPumpState gpState = GasPumpState.getInstance();
      
        ReceiptPrinter rp = GasPumpWorld.gpWorld.getObjects(ReceiptPrinter.class).get(0);
        rp.setPrintApproval();
        
      
  }
}
