package model;

import java.util.ArrayList;
import java.util.List;

public class DistribuirCartas {
    public static List<Carta> lista = new ArrayList<>();
    public static Baralho baralho = new Baralho();
    public static Carta carta1 = new Carta();
    public static Carta carta2 = new Carta();
    public static Carta carta3 = new Carta();
    public static Carta carta4 = new Carta();
    public static Carta carta5 = new Carta();
    public static Carta carta6 = new Carta();
    public static Carta vira = new Carta();
    public static int manilhaCarta;
    public static int manilha;

    public static int distribuirCartas(){
        baralho = new Baralho();
        baralho.embaralhar();
        carta1 = baralho.retirarUmCarta();
        carta2 = baralho.retirarUmCarta();
        carta3 = baralho.retirarUmCarta();
        carta4 = baralho.retirarUmCarta();
        carta5 = baralho.retirarUmCarta();
        carta6 = baralho.retirarUmCarta();
        vira = baralho.retirarUmCarta();
        manilhaCarta = vira.getValor().ordinal();
        manilha = manilhaCarta + 1;
        return 0;
    }
    
}
