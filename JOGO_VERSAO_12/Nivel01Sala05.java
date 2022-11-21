import greenfoot.*;
public class Nivel01Sala05 extends Nivel01{
    public Nivel01Sala05(int pos_x, int pos_y){    
       setBackground(new GreenfootImage("base.png"));
       addObject(new Player_1(), pos_x,pos_y);  
       addObject(new Player_2(), pos_x,pos_y);
       
       addObject(new portao(), NorteEntradaX,NorteEntradaY);
       addObject(new portasNivel01(), OesteEntradaX,OesteEntradaY);
     
    }
}
