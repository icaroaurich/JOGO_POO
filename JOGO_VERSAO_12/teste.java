import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class teste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teste extends Actor
{
    /**
     * Act - do whatever the teste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        World world = getWorld();
        int timer = Nivel00Intro.timer;
        String sTimer = String.valueOf(timer);
        world.showText(sTimer, 55, 55);
    }
}
