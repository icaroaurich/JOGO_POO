import greenfoot.*;
public class Nivel01Sala04 extends Nivel01{
    public Nivel01Sala04(int pos_x, int pos_y){     
       setBackground(new GreenfootImage("base.png"));
       addObject(new Player_1(), pos_x,pos_y);  
       addObject(new Player_2(), pos_x,pos_y);
       
       addObject(new portasNivel01(), NorteEntradaX,NorteEntradaY);
       addObject(new alavanca(), 900,390);
       SpawnInimigo(5);
       //int x = inimigo.getRandomNumberX();
       //int y = inimigo.getRandomNumberY();
       //addObject(new inimigo_zumbi(), x,y);
     
    }
    public void SpawnInimigo(int n){
        for (int i = 0; i < n; i++){
           int x = inimigo.getRandomNumberX();
           int y = inimigo.getRandomNumberY();
           addObject(new inimigo_zumbi(), x,y);
       }
    }
}
