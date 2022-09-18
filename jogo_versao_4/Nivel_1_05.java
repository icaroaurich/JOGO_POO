import greenfoot.*;
public class Nivel_1_05 extends World{
    public Nivel_1_05(int pos_x, int pos_y){    
       super(1024, 480, 1); 
       setBackground(new GreenfootImage("base.png"));
       addObject(new Player_1(), pos_x,pos_y);  
       addObject(new portao(), 520,25);
       addObject(new porta_n01_s05(), 27,230);
     
    }
}
