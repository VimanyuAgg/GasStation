/**
 * Write a description of class CarWashEvent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWashEvent implements Component 
{
    public void startEvent(){
     GasPumpState gpState = GasPumpState.getInstance();
     
     if(gpState.getState() == State.isValidatedButUnfueled || gpState.getState() == State.isCarWashSelected)
     {
        GasPumpWorld.gpWorld.removeObjects(GasPumpWorld.gpWorld.getObjects(DisplayScreen.class));
     DisplayScreen ds3 = new DisplayScreen("Do you want to add a Car wash ? Discount 20% on Fuel");
     GasPumpWorld.gpWorld.addObject(ds3,400,250);
     DisplayScreen ds4 = new DisplayScreen("OK");
     DisplayScreen ds5 = new DisplayScreen("NO");
     GasPumpWorld.gpWorld.addObject(ds4,170,200);
      GasPumpWorld.gpWorld.addObject(ds5,480,100);
     gpState.setState(State.isCarWashSelected);
        }   
    }
}
