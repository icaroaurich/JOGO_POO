import greenfoot.*;
public class Nivel01Sala01 extends Nivel01{
    public Nivel01Sala01(int pos_x, int pos_y){    
        setBackground(new GreenfootImage("base.png"));
        
        addObject(new Player_1(), pos_x,pos_y);  
        addObject(new Player_2(), pos_x,pos_y);
        addObject(new portasNivel01(), NorteEntradaX,NorteEntradaY);
        addObject(new portao(), SulEntradaX,SulEntradaY);
        addObject(new enemy_bat(), 200,200);
        
    }
    public Nivel01Sala01(){    
        setBackground(new GreenfootImage("base.png"));

        addObject(new Player_1(), 520-50,300+80);  
        addObject(new Player_2(), 620-50,300+80);
        addObject(new portasNivel01(), NorteEntradaX,NorteEntradaY);
        addObject(new portao(), SulEntradaX,SulEntradaY);
        addObject(new enemy_bat(), 200,200);
    }
}
