import greenfoot.*;
public class Nivel00Vilarejo extends World{
    static int pos_x = 100;
    static int pos_y = 200;
    public static final int LarguraDoCenario = 1024;
    public static final int AlturaDoCenario = 480;
    public Nivel00Vilarejo(){    
        super(LarguraDoCenario, AlturaDoCenario , 1); 
        setBackground(new GreenfootImage("00_01.png"));
        addObject(new Player_1(), pos_x,pos_y);  
        addObject(new Player_2(), pos_x+100,pos_y);  
        addObject(new portasNivel00(), 950,225);
    }
}
