import greenfoot.*;
public class Nivel_1_04 extends World{
    public Nivel_1_04(int pos_x, int pos_y){    
       super(1024, 480, 1); 
       setBackground(new GreenfootImage("base.png"));
       addObject(new Player_1(), pos_x,pos_y);  
       addObject(new porta_n01_s04(), 526,25);
       addObject(new alavanca(), 526,325);
     
    }
}
