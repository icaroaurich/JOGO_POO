import greenfoot.*;
public class Nivel03Sala01 extends Nivel03{

    public Nivel03Sala01(int pos_x, int pos_y){     
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), pos_x,pos_y);  
       addObject (new portasNivel03(),164,56);       
    }
}
