import greenfoot.*;
public class Nivel01Sala02 extends Nivel01{
    public Nivel01Sala02(int pos_x, int pos_y){    
       setBackground(new GreenfootImage("base.png"));
       
       addObject(new Player_1(), pos_x-50,pos_y);  
       addObject(new Player_2(), pos_x+50,pos_y);  
       
       addObject(new portasNivel01(), SulEntradaX,SulEntradaY); //sul
       addObject(new portasNivel01(), OesteEntradaX,OesteEntradaY);  // oeste
       addObject(new portasNivel01(), LesteEntradaX,LesteEntradaY); // leste
       addObject(new enemy_bat(), 100,100);     
    }
}
