import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class porta_n01_s01 extends Actor
{
    public void act()
    {
        Actor Player_1;
        Player_1 = getOneIntersectingObject(Player_1.class);
        if (Player_1 !=null){
            Greenfoot.setWorld(new Nivel_1_02(526,390));// norte
        }
    }
}
