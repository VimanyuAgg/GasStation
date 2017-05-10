import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Nozzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nozzle extends Actor
{
    /**
     * Act - do whatever the Nozzle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void drag(){
    
    
    }
    boolean startFilling = false;
        long startTime=0;
        long counter = 0;
    boolean textDisplayedOnce = false;
    public void act() 
    {
        // Add your action code here.
        GasPumpState gpState = GasPumpState.getInstance();
       
        //NozzleHole nozzleHole = world.getObjects(NozzleHole.class).get(0);
        if(gpState.getState() == State.isFuelSelectedButUnfueled){
           World world = getWorld();
            int mouseX=0;
           int mouseY=0;
           
           if (Greenfoot.mouseDragged(this)){
               if (!startFilling){
                   startFilling = true;
                   startTime = System.currentTimeMillis();
                }
                MouseInfo mouse = Greenfoot.getMouseInfo();  
                mouseX=mouse.getX();  
                mouseY=mouse.getY();  
                setLocation(mouseX, mouseY);
                
            }
          
            if(startFilling){
                counter++;
                
                 //ds =new DisplayScreen("");
                 //System.out.println("textDisplayedOnce: "+textDisplayOnce);
                if(!textDisplayedOnce){
                    world.removeObjects(getWorld().getObjects(DisplayScreen.class));
                    System.out.println("textDisplayedOnce: "+textDisplayedOnce);
                DisplayScreen ds = new DisplayScreen("Fuel Filling in progress...");
                world.addObject(ds,350,250);
                textDisplayedOnce = true;
                }
                 DisplayScreen ds2 = new DisplayScreen(Long.toString(counter));
                 world.removeObject(ds2);
                 world.addObject(ds2,700,550);
                 //List<NozzleHole> nozzleHole = getIntersectingObjects(NozzleHole.class);
                 //nozzleHole != null && nozzleHole.size() != 0 
                 if(getOneObjectAtOffset(0,0,NozzleHole.class) !=null && counter >10){
                     //for(NozzleHole n : nozzleHole){
                         long endTime = System.currentTimeMillis();
                         int durationMillis = (int)(endTime - startTime);
                         System.out.println("You fueled for "+Integer.toString(durationMillis/1000)+ " seconds"); 
                     //}
                     
                     world.removeObjects(getWorld().getObjects(DisplayScreen.class));
                        
                     DisplayScreen ds3 = new DisplayScreen("Fuel Filled");
                     world.addObject(ds3,350,250);
                     gpState.setState(State.isFilled);
                    }
                }   
           
           }
        
    }    
}
