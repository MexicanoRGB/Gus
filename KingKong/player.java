import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage player = new GreenfootImage("Player1.png");
    public void act() 
    {
        int x=0, y=0;
       if(Greenfoot.isKeyDown("a")){
        x=-3;
        player = new GreenfootImage("Player1.png");
        }
        if(Greenfoot.isKeyDown("d")){
        x= 3;
        player = new GreenfootImage("Player2.png");
        }
       setImage(player);
       if(isTouching(escada.class)){
           if(Greenfoot.isKeyDown("w")){
               y-=3;
            }
            if(Greenfoot.isKeyDown("s")){
                y+=3;
            }
        }
       if(Greenfoot.isKeyDown("space")){
        if(getOneObjectAtOffset(0, getImage().getHeight()/2, chao.class)!=null){
            y=-52;
        }
        }
        if(getOneObjectAtOffset(0, getImage().getHeight()/2, chao.class)==null){
            y+=1;
        }
        setLocation(getX()+x, getY()+y);
        
        if(isTouching(barril.class)){
        Greenfoot.stop();
        getWorld().showText("Game Over", 550, 300);
        }
        if(isTouching(ana.class)){
        Greenfoot.stop();
        getWorld().showText("Ganhou", 550, 300);
        }
        }
  
    }

