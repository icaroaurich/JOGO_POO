import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Nivel02 extends World
{
    // posicaoPlayer
    //static int posX = 520;
    //static int posY = 390;
    //Entrada e saidas norte
    public static final int NorteEntradaX = 520;
    public static final int NorteEntradaY= 25;
    public static final int NorteSaidaX= 520;
    public static final int NorteSaidaY= 390;
    //Entradas e saudas Sul
    public static final int SulEntradaX = 520;
    public static final int SulEntradaY= 456;
    public static final int SulSaidaX= 520;
    public static final int SulSaidaY= 90;
    //Entradas e saidas Leste
    public static final int LesteEntradaX = 998;
    public static final int LesteEntradaY= 230;
    public static final int LesteSaidaX= 90;
    public static final int LesteSaidaY= 230;
    //Entradas e saidas Oeste
    public static final int OesteEntradaX = 27;
    public static final int OesteEntradaY= 230;
    public static final int OesteSaidaX= 930;
    public static final int OesteSaidaY= 230;
    public Nivel02()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(Param.LarguraDoCenario, Param.AlturaDoCenario, 1);
    }
}