import greenfoot.*;
public class porta_n02_s03 extends Actor
{
    public void act()
    {
        Actor Player_1;
        Player_1 = getOneIntersectingObject(Player_1.class);
        int y = getY();
        int x = getX();        
        if (x == 520 && y == 456){
            //setRotation(180); // sul
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_04(520,90));}
        }
        
        if (x == 998 && y == 230){
            //setRotation(180); // leste
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_02(90,230));}
        }
    }
}
