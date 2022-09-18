import greenfoot.*;
public class Nivel_0 extends World{
    static int pos_x = 100;
    static int pos_y = 200;
    public static final int LarguraDoCenario = 1024;
    public static final int AlturaDoCenario = 480;
    public Nivel_0(){    
        super(LarguraDoCenario, AlturaDoCenario , 1); 
        setBackground(new GreenfootImage("00_01.png"));
        addObject(new Player_1(), pos_x,pos_y);  
    }
}
