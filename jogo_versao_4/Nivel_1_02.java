import greenfoot.*;
public class Nivel_1_02 extends World{
    public Nivel_1_02(int pos_x, int pos_y){    
       super(1024, 480, 1); 
       setBackground(new GreenfootImage("base.png"));
       addObject(new Player_1(), pos_x,pos_y);  
       addObject(new porta_n01_s02(), 520,456); //sul
       addObject(new porta_n01_s02(), 27,230);  // oeste
       addObject(new porta_n01_s02(), 998,230); // leste
       addObject(new enemy_bat(), 100,100);
     
    }
}
