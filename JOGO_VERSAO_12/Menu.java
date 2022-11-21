import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Menu extends World{
    int tela = 1;
    public Menu(){    
        super(Param.LarguraDoCenario, Param.AlturaDoCenario , 1);
        setBackground("menu_0"+tela+".png");
        Nivel00Intro.timer = 2000;
    }
    public void act(){
        String key = Greenfoot.getKey();
        if(("s".equals(key) || "down".equals(key))){
            if(tela == 3){tela = 1;}
            else{tela++;}
            setBackground("menu_0"+tela+".png");
        }
        if(("w".equals(key) || "down".equals(key))){
            if(tela == 1){tela = 3;}
            else{tela--;}
            setBackground("menu_0"+tela+".png");
        }

        if("enter".equals(key)){
            switch(tela){
                case 1:Greenfoot.setWorld(new Nivel00Intro());break;                        
                case 2:Greenfoot.setWorld(new Creditos());    break;                
                case 3:Greenfoot.stop();                      break;
            }
        }
    }
}
