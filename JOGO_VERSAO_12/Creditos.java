import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Creditos extends World{
    public static final int LarguraDoCenario = 1024;
    public static final int AlturaDoCenario = 480;
    int tela = 1;
    int auswahl;
    public Creditos(){    
        super(LarguraDoCenario, AlturaDoCenario , 1);
        setBackground("creditos.png");
    }
    public void act(){
        String key = Greenfoot.getKey();
        if("enter".equals(key)){{
            if (tela == 1){Greenfoot.setWorld(new Menu());}
        }
        }
    }
}
