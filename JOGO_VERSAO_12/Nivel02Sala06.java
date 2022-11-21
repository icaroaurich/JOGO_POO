import greenfoot.*;
public class Nivel02Sala06 extends Nivel02{
  
    public Nivel02Sala06(int posX, int posY){     
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), posX,posY);  
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ; // norte
       
       
    }
}
