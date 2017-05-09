/**
 * Write a description of class FuelEven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelEvent implements Component 
{
        
    public void startEvent(){
    
    Fuel93 f93 = GasPumpWorld.gpWorld.getObjects(Fuel93.class).get(0);
    f93.setToWorkingState();
    Fuel87 f87 = GasPumpWorld.gpWorld.getObjects(Fuel87.class).get(0);
    f93.setToWorkingState();

    Fuel89 f89 = GasPumpWorld.gpWorld.getObjects(Fuel89.class).get(0);
    f93.setToWorkingState();

    }
}
