import greenfoot.*;
public class porta_n01_s03 extends Actor
{
    public void act()
    {
        Actor Player_1;
        Player_1 = getOneIntersectingObject(Player_1.class);
        int y = getY();
        int x = getX();
        if (x == 500 && y == 456){
            setRotation(180);
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_1_04(526,90));}
        }
        if (x == 995 && y == 233){
            setRotation(90);
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_1_02(90,234));}
        }
    }
}
