import greenfoot.*;
public class porta_n01_s02 extends Actor
{
    public void act()
    {
        Actor Player_1;
        Player_1 = getOneIntersectingObject(Player_1.class);
        int y = getY();
        int x = getX();
        if (x == 27 && y == 230){ 
            setRotation(-90); // oeste
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_1_03(931,255));}
        }
        if (x == 520 && y == 456){ 
            setRotation(180); //sul
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_1_01(520,90));} 
        }
        if (x == 998 && y == 230){
            setRotation(90); // leste
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_1_05(100,227));} 
        }
    }
}
