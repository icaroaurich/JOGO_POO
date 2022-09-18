import greenfoot.*;
public class Nivel_1_06 extends World{
    static int pos_x = 520;
    static int pos_y = 390;
    //int delay = 5000;
    public Nivel_1_06(int pos_x, int pos_y){    
       super(1024, 480, 1); 
       setBackground(new GreenfootImage("base.png"));
       addObject(new Player_1(), pos_x,pos_y);  
       addObject (new porta_n01_s06(),741,132);
       addObject(new portao(), 520,456);
       //Timer timer = new timer() ;
       
    }
}
