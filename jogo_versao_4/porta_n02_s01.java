import greenfoot.*;
public class porta_n02_s01 extends Actor
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
                Greenfoot.setWorld(new Nivel_2_02(520,390));}
        }
        
        if (x == 998 && y == 230){
            //setRotation(180); // leste
            if (Player_1 !=null){
                //Greenfoot.setWorld(new Nivel_2_01(940,230));}
                Greenfoot.setWorld(new Nivel_2_07(90,230));}
        }
    }
}
