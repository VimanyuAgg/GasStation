/**
 * Write a description of class CarWashEvent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWashEvent implements Component 
{
    public void startEvent(){
     GasPumpWorld.gpWorld.removeObjects(GasPumpWorld.gpWorld.getObjects(DisplayScreen.class));
     DisplayScreen ds3 = new DisplayScreen("Do you want to add a Car wash ? Discount 20% on Fuel");
     GasPumpWorld.gpWorld.addObject(ds3,400,250);
     
    }
}
