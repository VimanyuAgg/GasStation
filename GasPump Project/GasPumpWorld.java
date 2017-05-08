import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumpWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GasPumpWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare(){
        GasPumpMachine gasMachine = new GasPumpMachine();
        addObject(gasMachine, 0, 0);
        addObject( new RealCard(), 57, 71 );
        addObject( new FakeCard(), 57, 100 );
        addObject( new CardSlot(),34,39);
        addObject( new DisplayScreen(), 367, 367 ) ;
        addObject( new Keypad(), 367, 550);
        addObject( new NozzleHole(), 600, 450);
        addObject( new Nozzle(), 600,450);
        
      
       
    }

    
}


