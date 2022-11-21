import greenfoot.*;
public class Nivel02Sala01 extends Nivel02{  
    public Nivel02Sala01(int posX, int posY){ 
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY);  
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ;
       addObject (new portasNivel02(),LesteEntradaX,LesteEntradaY);
    }
    public Nivel02Sala01(){    
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), 741,132);  
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ;
       addObject (new portasNivel02(),LesteEntradaX,LesteEntradaY); 
       alavanca.fechado = true;
       portao.fechado = true;
    }
    
}
