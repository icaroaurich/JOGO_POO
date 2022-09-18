import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class portao extends Actor
{
    static boolean fechado = true;
    GreenfootImage portao = new GreenfootImage("portao.png");
    GreenfootImage portaoa = new GreenfootImage("portaoa.png");
    public void act()
    {
        int y = getY();
        int x = getX();
            
        if (x == 520 && y == 25){ 
            if (fechado == true){setImage(portao);}
            else{
                setImage(portaoa);
                Actor Player_1;
                Player_1 = getOneIntersectingObject(Player_1.class);
                if (Player_1 !=null){
                    Greenfoot.setWorld(new Nivel_1_06(520,390));
                    }
            }       
        }
    }
}