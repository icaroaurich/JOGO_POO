import greenfoot.*;
public class Nivel_2_01 extends World{  
    public Nivel_2_01(int pos_x, int pos_y){ 
       super(1024, 480, 1); 
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), pos_x,pos_y);  
       //addObject(new Player_1(), pos_x,pos_y);
       addObject (new porta_n02_s01(),520,25) ; // norte
       //addObject (new porta_n01_s01(),520,456); // sul
       addObject (new porta_n02_s01(),998,230); // leste
       //addObject (new porta_n01_s01(),27,230) ; // oeste
       
    }
    public Nivel_2_01(){    
       super(1024, 480, 1); 
       setBackground(new GreenfootImage("base2.png"));
       addObject(new Player_1(), 741,132);  
       //addObject(new Player_1(), pos_x,pos_y);
       addObject (new porta_n02_s01(),520,25) ; // norte
       //addObject (new porta_n01_s01(),520,456); // sul
       addObject (new porta_n02_s01(),998,230); // leste
       //addObject (new porta_n01_s01(),27,230) ; // oeste
       
    }
    
}
