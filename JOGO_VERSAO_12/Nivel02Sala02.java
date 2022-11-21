import greenfoot.*;
public class Nivel02Sala02 extends Nivel02{
    
    public Nivel02Sala02(int posX, int posY){     
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY);  
       addObject (new portasNivel02(),SulEntradaX,SulEntradaY); // sul
       addObject (new portasNivel02(),OesteEntradaX,OesteEntradaY) ; // oeste
       
    }
}
