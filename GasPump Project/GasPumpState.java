import java.util.*;

/**
 * Write a description of class GasPumpState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumpState extends Subject
{
    public enum State{
        isUnValidated,
     isValidatedButUnfueled,
     isFuelSelectedButUnfueled,
     isFilling,
     isFilled,
     isPringReceipt,
     isTimeOut;
    }
    
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
    
    private State state;
    
    public State getState(){
        return this.state;
    }
  
    public void setState(State state){
        this.state = state;
        notifyObservers();
    }
    
    public void register(Observer o){
        observerList.add(o);
        
    }
    
    public void unregister(Observer o){
        observerList.remove(o);
    }

    
    private void notifyObservers(){
     for(Observer o: observerList){
         o.act();
        
        
     }
     System.out.println("All observers notified");   
    }
}
