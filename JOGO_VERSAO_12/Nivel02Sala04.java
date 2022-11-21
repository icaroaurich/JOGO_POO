import greenfoot.*;
public class Nivel02Sala04 extends Nivel02{
    public Nivel02Sala04(int posX, int posY){     
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY);  
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ; // norte
       addObject (new portasNivel02(),SulEntradaX,SulEntradaY); // sul
       //addObject (new porta_n02_s04(),998,230); // leste
       //addObject (new porta_n01_s01(),27,230) ; // oeste
       
    }
}
