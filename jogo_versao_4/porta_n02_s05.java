import greenfoot.*;
public class porta_n02_s05 extends Actor
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
                Greenfoot.setWorld(new Nivel_2_04(520,390));}
        }
        
        if (x == 520 && y == 456){
            //setRotation(180); // sul
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_06(520,90));}
        }
    }
}
