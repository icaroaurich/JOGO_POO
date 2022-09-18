import greenfoot.*;
public class porta_n01_s04 extends Actor
{
    public void act()
    {
        Actor Player_1;
        Player_1 = getOneIntersectingObject(Player_1.class);
        int y = getY();
        int x = getX();
        if (x == 526 && y == 25){
            //setRotation(180);
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_1_03(520,390));}
        }
    }
}
