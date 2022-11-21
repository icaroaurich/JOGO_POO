import greenfoot.*;
public class Player_2 extends Player{
    int velocidade = 5;
    int direcao = 0;
    static int vidap2 = 3;
        public void act(){
            int y = getY();
            int x = getX();
            mover(x,y);
            
            if (Greenfoot.isKeyDown("5")){atacar(x,y,direcao);}
            
            Actor inimigo;
            inimigo = getOneIntersectingObject(inimigo.class);
            //if (inimigo !=null){receberDano(inimigo);}
            
            //vidaM();
            }
        public void atacar(int x,int y,int direcao){
            World world = getWorld();
            World MyWorld;
            if (getWorld().getObjects(Player_2_atk.class).isEmpty()){
                MyWorld = getWorld();
                if (direcao == 0){
                    world.addObject(new Player_2_atk(), x,y-50);
                    Player_2_atk.direcao=0;}
                else if (direcao == 1){
                    world.addObject(new Player_2_atk(), x+50,y);
                    Player_2_atk.direcao=1;
                }
                else if (direcao == 2){
                    world.addObject(new Player_2_atk(), x,y+50);
                    Player_2_atk.direcao=2;
                }
                else if (direcao == 3){
                    world.addObject(new Player_2_atk(), x-50,y);
                    Player_2_atk.direcao=3;
                }
            }
        }
        public void mover(int x,int y){
            if (Greenfoot.isKeyDown("left")){
                setRotation(-90);
                direcao = 3;
                x = x-velocidade;}
            if (Greenfoot.isKeyDown("right")){
                direcao = 1;
                setRotation(90);
                x = x+velocidade;}
            if (Greenfoot.isKeyDown("up")){
                direcao = 0;
                setRotation(0);
                y = y-velocidade;}
            if (Greenfoot.isKeyDown("down")){
                direcao = 2;
                setRotation(180);
                y = y+velocidade;}
            setLocation(x,y);
        }
        public void vidaM(){
            criar();
            if (vidap2 == 3){
                coracao.bvivo1 = true;
                coracao.bvivo2 = true;
                coracao.bvivo3 = true;
            }
            else if (vidap2 == 2){
                //coracao.bvivo1 = true;
                //coracao.bvivo2 = true;
                coracao.bvivo3 = false;
            }
            else if (vidap2 == 1){
                //coracao.bvivo1 = true;
                coracao.bvivo2 = false;
                //coracao.bvivo3 = false;
            }
            else if (vidap2 == 0){
                coracao.bvivo1 = false;
                Greenfoot.stop();
            }
                    }
        public static void perderVida(){
            vidap2--;
        }
        public static void ganharVida(){
            vidap2++;
        }
        public void criar(){
            World MyWorld;
            MyWorld = getWorld();
            if (getWorld().getObjects(coracao.class).isEmpty()){
                MyWorld.addObject(new coracao(), 100,15);
                MyWorld.addObject(new coracao(), 140,15);
                MyWorld.addObject(new coracao(), 180,15);
            }
        }
        public void receberDano(Actor inimigo){
                int recuo = 80;
                inimigo = (Actor)getWorld().getObjects(inimigo.class).get(0);
                int xe = inimigo.getX();
                int ye = inimigo.getY();
                
                int x = getX();
                int y = getY();
                
                if (x > xe){x = x+recuo;}
                if (x < xe){x = x-recuo;}
                if (y > ye){y = y+recuo;}
                if (y < ye){y = y-recuo;}
                perderVida();
                setLocation(x,y);
        }
}

