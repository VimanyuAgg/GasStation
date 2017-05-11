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
        Fuel93 f93 = GasPumpWorld.gpWorld.getObjects(Fuel93.class).get(0);
        Fuel87 f87 = GasPumpWorld.gpWorld.getObjects(Fuel87.class).get(0);
        Fuel89 f89 = GasPumpWorld.gpWorld.getObjects(Fuel89.class).get(0);
        System.out.println("Fuel event Start Triggered");
        GasPumpWorld.gpWorld.removeObjects(GasPumpWorld.gpWorld.getObjects(DisplayScreen.class));
        DisplayScreen ds = new DisplayScreen("Please select the Fuel Type");
       // DisplayScreen ds2 = new DisplayScreen(f93.getPrise());
        //DisplayScreen ds3 = new DisplayScreen(f89.getPrise());
        //DisplayScreen ds4 = new DisplayScreen(f87.getPrise());
         //GasPumpWorld.gpWorld.addObject(ds2,351,259);
         //GasPumpWorld.gpWorld.addObject(ds3,421,259);
         //GasPumpWorld.gpWorld.addObject(ds4,491,259);
         GasPumpWorld.gpWorld.addObject(ds,320,180); 
           
          // GasPumpWorld.gpWorld.addObject(ds,350,250);

    f93.setToWorkingState();
    //System.out.println("Commanded Fuel93 to start working");

    f87.setToWorkingState();
    


    f89.setToWorkingState();
    }
    
    
    }

    }
