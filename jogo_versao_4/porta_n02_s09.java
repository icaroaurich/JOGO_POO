import greenfoot.*;
public class porta_n02_s09 extends Actor
{
    public void act()
    {
        Actor Player_1;
        Player_1 = getOneIntersectingObject(Player_1.class);
        int y = getY();
        int x = getX();
        if (x == 27 && y == 230){
            //setRotation(180); // leste
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_08(930,230));}
        }        
        if (x == 998 && y == 230){
            //setRotation(180); // oeste
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_10(90,230));}
        }
    }
}
