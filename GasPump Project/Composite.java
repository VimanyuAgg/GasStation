/**
 * Write a description of class Composite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Composite implements Component 
{
    private List<Component> components = new ArrayList<Component>();
    
    public void addChild(Component c){
        components.add(c);
    }
    
    public void removeChild(Component c){
        components.remove(c);
    }
    
     public void act() {
        System.out.println( "Inside composite act" );
        for (Component obj  : components)
        {
            obj.act();
        }
        
    }
}
