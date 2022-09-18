import greenfoot.*;
public class Nivel_1_01 extends World{
    public static final int LarguraDoCenario = 1024;
    public static final int AlturaDoCenario = 480;
    public Nivel_1_01(int pos_x, int pos_y){    
        super(LarguraDoCenario, AlturaDoCenario,1); 
        setBackground(new GreenfootImage("base.png"));
        addObject(new Player_1(), pos_x,pos_y);  
        addObject(new porta_n01_s01(), 520,25);  
        addObject(new portao(), 520,456);
        addObject(new enemy_bat(), 200,200);
    }
    public Nivel_1_01(){    
        super(LarguraDoCenario, AlturaDoCenario,1); 
        setBackground(new GreenfootImage("base.png"));
        addObject(new Player_1(), 520,390);  
        addObject(new porta_n01_s01(), 520,25);  
        addObject(new portao(), 520,456);
        addObject(new enemy_bat(), 200,200);
    }
}
