import greenfoot.*;
public class Nivel02Sala13 extends Nivel02{
    
    public Nivel02Sala13(int posX, int posY){     
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY);  
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY); // norte
       //addObject (new porta_n02_s12(),520,456); // sul
       //addObject (new porta_n02_s08(),998,230); // leste
       //addObject (new porta_n02_s07(),27,230) ; // oeste
       
    }
}
