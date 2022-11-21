import greenfoot.*;
public class Nivel02Sala17 extends Nivel02{

    public Nivel02Sala17(int posX, int posY){    
        setBackground(new GreenfootImage("base2.png"));
        addObject(new Player_1(), posX,posY);  
        addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ; // norte
        addObject (new portasNivel02(),SulEntradaX,SulEntradaY) ; // norte
        // ter algo pra somar vida
    }
}
