import greenfoot.*;
public class Nivel00Intro extends World{
    public static int timer = 2000;
    public Nivel00Intro(){    
        super(Param.LarguraDoCenario, Param.AlturaDoCenario , 1); 
        GreenfootSound backgroundMusic = new GreenfootSound("teste_1.mp3");
        //addObject(new teste(), 22,240);
        backgroundMusic.play();
    }
    public void act(){
        if (timer > 1430){setBackground(new GreenfootImage("intro_1.png"));}
        else{
            if (timer > 1000){setBackground(new GreenfootImage("intro_2.png"));}
            else{
                if (timer > 500){setBackground(new GreenfootImage("intro_3.png"));}
                else{setBackground(new GreenfootImage("intro_4.png"));}}}
        timer--;
        if (timer == 0){Greenfoot.setWorld(new Nivel00Vilarejo());}
    }
}

