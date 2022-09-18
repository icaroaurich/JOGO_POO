import greenfoot.*;
public class Nivel_1_03 extends World{
    public Nivel_1_03(int pos_x, int pos_y){    
       super(1024, 480, 1); 
       setBackground(new GreenfootImage("base.png"));
       addObject(new Player_1(), pos_x,pos_y);  
       addObject(new porta_n01_s03(), 500,456);
       addObject(new porta_n01_s03(), 995,233);
     
    }
}
