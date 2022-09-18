import greenfoot.*;
public class porta_n02_s06 extends Actor
{
    public void act()
    {
        Actor Player_1;
        Player_1 = getOneIntersectingObject(Player_1.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 25){
            //setRotation(180); // norte
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_05(520,390));}
        }
    }
}
