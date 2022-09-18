import greenfoot.*;
public class porta_n01_s05 extends Actor
{
    public void act()
    {
        Actor Player_1;
        Player_1 = getOneIntersectingObject(Player_1.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 25){
            //setRotation(180);
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_1_06(520,390));}
        }
        
        if (x == 27 && y == 230){
            //setRotation(180);
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_1_02(940,230));}
        }
    }
}
