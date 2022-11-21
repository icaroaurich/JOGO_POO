import greenfoot.*;
public class Nivel02Sala15 extends Nivel02{
    public Nivel02Sala15(int posX, int posY){    
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY);  
       //addObject (new porta_n02_s14(),520,25); // norte
       //addObject (new porta_n02_s12(),520,456); // sul
       //addObject (new porta_n02_s08(),998,230); // leste
       addObject (new portasNivel02(),OesteEntradaX,OesteEntradaY) ; // oeste
       
    }
}
