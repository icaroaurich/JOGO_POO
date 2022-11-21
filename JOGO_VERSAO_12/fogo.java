import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class fogo extends Boss1{
    int quadro = 1;
    int timer = 100;
    static boolean causarDano = false;
    public void act(){
        GreenfootImage fogo = new GreenfootImage("fogo.png");
        GreenfootImage sombra = new GreenfootImage("fogoSombra.png");
        if (timer > 19) {
            setImage(sombra);
            causarDano = false;}
        if (timer < 20) {
            causarDano = true;
            setImage(fogo);
            }
        
        timer--;
        if (timer <= 0) {
            getWorld().removeObject(this);
        }
    }
}
