import greenfoot.*;
public class Nivel02Sala08 extends Nivel02{

    public Nivel02Sala08(int posX, int posY){    
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY);  
       //addObject (new porta_n02_s07(),520,25) ; // norte
       addObject (new portasNivel02(),SulEntradaX,SulEntradaY); // sul
       addObject (new portasNivel02(),LesteEntradaX,LesteEntradaY); // leste
       //addObject (new porta_n02_s07(),27,230) ; // oeste
       
    }
}
