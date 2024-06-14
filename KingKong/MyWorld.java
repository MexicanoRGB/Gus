import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int tempo = 0;
    public void act(){
        tempo++;
        if(tempo %150==0){
            barril Barril = new barril();
            addObject(Barril, 850, 50);
        }
        
        if(tempo %250==0){
            barril Barril = new barril();
            addObject(Barril, 1000, 190);
        }
        if(tempo %350==0){
            barril Barril = new barril();
            addObject(Barril, 1000, 300);
        }
    }
    public MyWorld()
    {    
        
        super(1100, 600, 1, false); 
        chao[] chaos = new chao[6];
        for(int i=1; i<6; i++){
            chaos[i] =new chao();
            addObject(chaos[i], getWidth()/2, 115*i);
        }
        
        escada[] escadas = new escada[6];
        for(int i=1; i<6; i++){
            escadas[i] = new escada();
        }
        
        addObject (escadas[1], Greenfoot.getRandomNumber(1055), 173);
        addObject (escadas[2], Greenfoot.getRandomNumber(1055), 287);
        addObject (escadas[3], Greenfoot.getRandomNumber(1055), 400);
        addObject (escadas[4], 1055, 515);
        
        player Player = new player();
        addObject(Player, 45, 540);
        gugorila Gugorila = new gugorila();
        addObject(Gugorila, 950, 55);
        ana Ana = new ana();
        addObject(Ana, 1050, 70);
    }
}
