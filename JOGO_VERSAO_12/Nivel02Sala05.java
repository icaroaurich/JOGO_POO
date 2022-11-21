import greenfoot.*;
public class Nivel02Sala05 extends Nivel02{
    
    public Nivel02Sala05(int posX, int posY){    
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY);  
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ; // norte
       addObject (new portasNivel02(),SulEntradaX,SulEntradaY); // sul
       //addObject (new porta_n01_s01(),998,230); // leste
       //addObject (new porta_n01_s01(),27,230) ; // oeste
       
    }
}
