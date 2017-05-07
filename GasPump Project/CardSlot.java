import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class CardSlot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardSlot extends Actor
{
    /**
     * Act - do whatever the CardSlot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        List<Card> cards = getIntersectingObjects(Card.class);
        if(cards != null && cards.size() != 0){
            for(Card card : cards){
                if(Greenfoot.mouseDragEnded(card)){
                    cardSlided(card);
                }
            }
        }
    }
    
    
    
    private void cardSlided(Card card){
        if( card instanceof RealCard){
            System.out.println("Intersecting!!");
        }
    }
    
}
