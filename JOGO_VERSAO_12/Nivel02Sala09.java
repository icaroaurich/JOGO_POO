import greenfoot.*;             
public class Nivel02Sala09 extends Nivel02{
    
    public Nivel02Sala09(int posX, int posY){    
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY);  
       addObject(new portao(), NorteEntradaX,30);
       addObject (new portasNivel02(),LesteEntradaX,LesteEntradaY);
       addObject (new portasNivel02(),OesteEntradaX,OesteEntradaY) ;
    }
}