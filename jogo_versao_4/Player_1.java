import greenfoot.*;
public class Player_1 extends Actor{
    int velocidade = 5;
    int direcao = 0;
    static int vida = 3;
        public void act(){
            int y = getY();
            int x = getX();
            mover(x,y);
            if (Greenfoot.isKeyDown("j")){atacar(x,y,direcao);}
            if (Greenfoot.isKeyDown("p")){
                Greenfoot.setWorld(new Nivel_1_01());
                vida = 3;}
            Actor enemy_bat;
            enemy_bat = getOneIntersectingObject(enemy_bat.class);
            if (enemy_bat !=null){receberDano();}
            vidaM();
            }
        public void atacar(int x,int y,int direcao){
            World world = getWorld();
            if (direcao == 0){
                world.addObject(new Player_1_atk(), x,y-50);
                Player_1_atk.direcao=0;}
            else if (direcao == 1){
                world.addObject(new Player_1_atk(), x+50,y);
                Player_1_atk.direcao=1;
            }
            else if (direcao == 2){
                world.addObject(new Player_1_atk(), x,y+50);
                Player_1_atk.direcao=2;
            }
            else if (direcao == 3){
                world.addObject(new Player_1_atk(), x-50,y);
                Player_1_atk.direcao=3;
            }
        }
        public void mover(int x,int y){
            if (Greenfoot.isKeyDown("a")){
                setRotation(-90);
                direcao = 3;
                x = x-velocidade;}
            if (Greenfoot.isKeyDown("d")){
                direcao = 1;
                setRotation(90);
                x = x+velocidade;}
            if (Greenfoot.isKeyDown("w")){
                direcao = 0;
                setRotation(0);
                y = y-velocidade;}
            if (Greenfoot.isKeyDown("s")){
                direcao = 2;
                setRotation(180);
                y = y+velocidade;}
            setLocation(x,y);
        }
        public void vidaM(){
            criar();
            if (vida == 3){
                coracao.bvivo1 = true;
                coracao.bvivo2 = true;
                coracao.bvivo3 = true;
            }
            else if (vida == 2){
                coracao.bvivo1 = true;
                coracao.bvivo2 = true;
                coracao.bvivo3 = false;
            }
            else if (vida == 1){
                coracao.bvivo1 = true;
                coracao.bvivo2 = false;
                coracao.bvivo3 = false;
            }
            else if (vida == 0){
                Greenfoot.stop();
            }
                    }
        public static void perderVida(){
            vida--;
        }
        public static void ganharVida(){
            vida++;
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
        public void receberDano(){
                int recuo = 80;
                Actor enemy_bat2 = (Actor)getWorld().getObjects(enemy_bat.class).get(0);
                int xe = enemy_bat2.getX();
                int ye = enemy_bat2.getY();
                
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

