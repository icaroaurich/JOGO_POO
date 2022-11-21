import greenfoot.*;             
public class Nivel02Sala18 extends Nivel02{
    
    public Nivel02Sala18(int posX, int posY){    
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY);  
       addObject(new portao(), NorteEntradaX,31);
       //addObject (new portasNivel02(),LesteEntradaX,LesteEntradaY);
       //addObject (new portasNivel02(),OesteEntradaX,OesteEntradaY) ;
    }
}
