/**
 * Write a description of class GasPumpState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumpState extends Subject
{
    private List<Observer> observerList = new ArrayList<Observer>();
    //ADD BOOLEANS; ENUM; STRINGS;
    /*
     * isUnValidated
     * isValidatedButUnfueled
     * isFuelSelectedButUnfueled
     * isFilling
     * isFilled
     * isPringReceipt
     * isTimeOut
     * 
     */
    public void register(Observer o){
        observerList.add(o);
        
    }
    
    public void unregister(Observer o){
        observerList.remove(o);
    }
    public void setState(){
    
        notifyObservers();
    }
    private void nofityObservers(){
     for(Observer o: observerList){
         o.act();
        
        
     }
     System.out.println("All observers notified");   
    }
}