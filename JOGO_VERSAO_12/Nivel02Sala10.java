import greenfoot.*;
public class Nivel02Sala10 extends Nivel02{
    
    public Nivel02Sala10(int posX, int posY){    
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY); 
       
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ; // norte 1
       addObject (new portasNivel02(),NorteEntradaX+70,NorteEntradaY) ; // norte 2
       //
       addObject (new portasNivel02(),SulEntradaX,SulEntradaY); // sul 1
       addObject (new portasNivel02(),SulEntradaX+70,SulEntradaY); // sul 2
       
       //
       addObject (new portasNivel02(),LesteEntradaX,LesteEntradaY); // leste
       addObject (new portasNivel02(),LesteEntradaX,LesteEntradaY+70); // leste
       //
       addObject (new portasNivel02(),OesteEntradaX,OesteEntradaY) ; // oeste 
       addObject (new alavanca(),100,100) ; // oeste 
       
    }
}

