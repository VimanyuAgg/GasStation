/**
 * Write a description of class FuelEven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelEvent implements Component 
{
        
    public void startEvent(){
    GasPumpState gpState = GasPumpState.getInstance();
    
    if(gpState.getState() == State.isValidatedButUnfueled){
        //do not proceed until proper state is set
        //System.out.println("Fuel event Start Triggered");
        GasPumpWorld.gpWorld.removeObjects(GasPumpWorld.gpWorld.getObjects(DisplayScreen.class));
        DisplayScreen ds = new DisplayScreen("Please select the Fuel Type");
           
           GasPumpWorld.gpWorld.addObject(ds,350,250);
    Fuel93 f93 = GasPumpWorld.gpWorld.getObjects(Fuel93.class).get(0);
    f93.setToWorkingState();
    //System.out.println("Commanded Fuel93 to start working");
    Fuel87 f87 = GasPumpWorld.gpWorld.getObjects(Fuel87.class).get(0);
    f87.setToWorkingState();
    

    Fuel89 f89 = GasPumpWorld.gpWorld.getObjects(Fuel89.class).get(0);
    f89.setToWorkingState();
    }
    
    
    }

    }