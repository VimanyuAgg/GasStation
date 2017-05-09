/**
 * Write a description of class PrintReceiptEvent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintReceiptEvent implements Component
{
  public void startEvent(){
  ReceiptPrinter rp = GasPumpWorld.gpWorld.getObjects(ReceiptPrinter.class).get(0);
  rp.setToWorkingState();
      
  }
}
