/**
 * Write a description of class Utils here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Utils  
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Utils
     */
    public Utils()
    {
    }
    
    public void drag(){
            int mouseX, mouseY ;
            
            if(Greenfoot.mouseDragged(this)) {          
                MouseInfo mouse = Greenfoot.getMouseInfo();  
                mouseX=mouse.getX();  
                mouseY=mouse.getY();  
                setLocation(mouseX, mouseY);  
            } 
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
