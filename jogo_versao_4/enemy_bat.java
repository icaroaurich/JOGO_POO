import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class enemy_bat extends Actor
{   int quadro = 1;
    int timer = 10;
    public void act(){
        frames();
        seguir();
        darDano();
        colisao();
    }
    public void frames(){
        GreenfootImage bat = new GreenfootImage("bat"+quadro+".png");
        setImage(bat);
        if (timer > 5) {quadro = 1;}
        if (timer < 5) {quadro = 2;}
        if (timer <= 0){timer = 10;}
        timer--;
    }
    public void colisao(){
        Actor Player_1_atk;
        Player_1_atk = getOneIntersectingObject(Player_1_atk.class);
        if (Player_1_atk !=null){getWorld().removeObject(this);}
    }
    public void darDano(){
        Actor Player_1;
        Player_1 = getOneIntersectingObject(Player_1.class);
        if (Player_1 !=null){
            //System.out.println("BORA");
            //receberDano();}
        }
    }
    public void seguir(){
        Actor Player_1 = (Actor)getWorld().getObjects(Player_1.class).get(0);
        int xp = Player_1.getX();
        int yp = Player_1.getY();
        int x = getX();
        int y = getY();
        if (x > xp){x--;}
        if (x < xp){x++;}
        if (y > yp){y--;}
        if (y < yp){y++;}
        setLocation(x,y);
    }
    public void receberDano(){
        int recuo = 80;
        Actor aPlayer_1 = (Actor)getWorld().getObjects(Player_1.class).get(0);
        int xp = aPlayer_1.getX();
        int yp = aPlayer_1.getY();
                
        int x = getX();
        int y = getY();
                
        if (x > xp){xp = xp+recuo;}
        if (x < xp){xp = xp-recuo;}
        if (y > yp){yp = yp+recuo;}
        if (y < yp){yp = yp-recuo;}
        Player_1.perderVida();
        //Player_1.receberDano(aPlayer_1);
        }
}
