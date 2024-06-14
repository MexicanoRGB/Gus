import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class barril here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class barril extends Actor
{
    /**
     * Act - do whatever the barril wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x=-3;
    public void act() 
    {
        int y = 0;
        if (!isTouching(chao.class)){
        y++;
            if(isAtEdge()){
                x *=-1;
                y +=80;
            }
        }
        setLocation(getX()+x, getY() +y );
        
        turn(x);
    }    
}
