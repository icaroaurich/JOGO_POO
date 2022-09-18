import greenfoot.*;
public class Nivel_2_04 extends World{
    public Nivel_2_04(int pos_x, int pos_y){    
       super(1024, 480, 1); 
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), pos_x,pos_y);  
       addObject (new porta_n02_s04(),520,25) ; // norte
       addObject (new porta_n02_s04(),520,456); // sul
       //addObject (new porta_n02_s04(),998,230); // leste
       //addObject (new porta_n01_s01(),27,230) ; // oeste
       
    }
}
