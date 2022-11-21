import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class alavanca extends parede
{
    static boolean fechado = true;
    GreenfootImage alavanca = new GreenfootImage("alavanca_1.png");
    GreenfootImage alavanca2 = new GreenfootImage("alavanca_2.png");
    public void act()
    {
        if (fechado == true){setImage(alavanca);}
        else{setImage(alavanca2);}
        
        Actor Player_1_atk;
        Player_1_atk = getOneIntersectingObject(Player_1_atk.class);
        if (Player_1_atk !=null){
            fechado = false;
            portao.fechado = false;}
        }
    }
