import greenfoot.*;
public class Nivel_2_07 extends World{
    static int pos_x = 520;
    static int pos_y = 390;
    public Nivel_2_07(int pos_x, int pos_y){    
       super(1024, 480, 1); 
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), pos_x,pos_y);  
       addObject (new porta_n02_s07(),520,25) ; // norte
       //addObject (new porta_n01_s01(),520,456); // sul
       //addObject (new porta_n01_s01(),998,230); // leste
       addObject (new porta_n02_s07(),27,230) ; // oeste
       
    }
}
