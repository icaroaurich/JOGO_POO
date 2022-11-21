import greenfoot.*;
public class Nivel02Sala11 extends Nivel02{
    public Nivel02Sala11(int posX, int posY){    
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY); 
       
       //addObject (new porta_n02_s10(),520,25) ; // norte
       addObject (new portasNivel02(),SulEntradaX,SulEntradaY); // sul
       //addObject (new porta_n02_s10(),998,230); // leste
       //addObject (new porta_n02_s10(),27,230) ; // oeste
    }
}

