import greenfoot.*;
public class porta_n01_s06 extends Actor
{
    public void act()
    {
        Actor Player_1;
        Player_1 = getOneIntersectingObject(Player_1.class);
        int y = getY();
        int x = getX();
        if (x == 741 && y == 132){
            //setRotation(180);
            if (Player_1 !=null){
                //Greenfoot.setWorld(new Nivel_2_01(741,132));}
                Greenfoot.setWorld(new Nivel_2_01());}
        }
    }
}
