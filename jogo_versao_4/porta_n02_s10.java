import greenfoot.*;
public class porta_n02_s10 extends Actor
{
    public void act()
    {
        Actor Player_1;
        Player_1 = getOneIntersectingObject(Player_1.class);
        int y = getY();
        int x = getX();
        if (x == 27 && y == 230){
            //setRotation(180); // leste 1
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_12(27,230));}
        }
        if (x == 27 && y == 230){
            //setRotation(180); // leste 2
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_13(930,290));}
        }        

        if (x == 520 && y == 25){
            //setRotation(180); // norte 1
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_14(520,390));}
        }
        if (x == 580 && y == 25){
            //setRotation(180); // norte 2
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_15(520,400));}
        }
        
        if (x == 520 && y == 456){
            //setRotation(180); // sul 1
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_16(523,400));}
        }
        if (x == 580 && y == 25){
            //setRotation(180); // sul 2
            if (Player_1 !=null){
                Greenfoot.setWorld(new Nivel_2_17(523,400));}
        }
    }
}

