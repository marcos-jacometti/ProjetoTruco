package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Truco {
    public static List<Carta> lista = new ArrayList<>();
    public static Carta carta1 = new Carta();
    public static Carta carta2 = new Carta();
    public static Carta carta3 = new Carta();
    public static Carta carta4 = new Carta();
    public static Carta carta5 = new Carta();
    public static Carta carta6 = new Carta();
    public static Carta vira = new Carta();
    public static Baralho baralho = new Baralho();
    public static Carta addCarta = new Carta();
    
    public static void main(String[] args) {
       Truco tr = new Truco();
       Scanner sc = new Scanner(System.in);
       int opcs = 0;
       distribuirCartas();
       do{
        menu(tr, sc);
       }while(opcs != 4);
    }

    public static void distribuirCartas(){
        baralho.embaralhar();
        System.out.println();

        carta1 = baralho.retirarUmCarta();
        carta2 = baralho.retirarUmCarta();
        carta3 = baralho.retirarUmCarta();
        carta4 = baralho.retirarUmCarta();
        carta5 = baralho.retirarUmCarta();
        carta6 = baralho.retirarUmCarta();
        vira = baralho.retirarUmCarta();
    }

    public static int menu(Truco tr, Scanner sc){
        System.out.println();
        System.out.println("Suas cartas: ");
        System.out.println(carta1);
        System.out.println(carta2);
        System.out.println(carta3);
        System.out.println();
        System.out.println("Vira: " + vira);
        System.out.println();
        
        int opcs;
        System.out.println("*** TRUCO DE MARRECO ***");
        System.out.println("1. Jogar carta: " + carta1);
        System.out.println("2. Jogar carta: " + carta2);
        System.out.println("3. Jogar cata: " + carta3);
        System.out.println("Digite sua opcao: ");
        opcs = Integer.parseInt(sc.nextLine());
        int seusPontos = 0;
        int ptAdver = 0;
        int seusPontos2 = seusPontos;
        int ptAdver2 = ptAdver;
        int seusPontos3 = seusPontos2;
        int ptAdver3 = ptAdver2;

            switch(opcs){
                case 1:
                    System.out.println();
                    System.out.println("Carta jogada: " + carta1);
                    System.out.println("Carta do adversario: " + carta4);

                    if(carta1 == null){
                        System.out.println("Carta ja foi jogada, tente outra");
                    }else if(carta1.getValor().ordinal() + 1 > carta4.getValor().ordinal()){
                        System.out.println("Voce ganhou a rodada! ");
                        seusPontos ++;
                        System.out.println("Seus pontos: " + seusPontos);
                        System.out.println("Pontos adversario: " + ptAdver);
                    }else if(carta4.getValor().ordinal() + 1 > carta1.getValor().ordinal()){
                        System.out.println("Ponto para o adversario");
                        ptAdver ++;
                        System.out.println("Seus pontos: " + seusPontos);
                        System.out.println("Pontos adversario: " + ptAdver);
                    }else if(carta1.getValor().ordinal()> carta4.getValor().ordinal()){
                        System.out.println("Voce ganhou a rodada! ");
                        seusPontos ++;
                        System.out.println("Seus pontos: " + seusPontos);
                        System.out.println("Pontos adversario: " + ptAdver);
                    }else if(carta1.getValor().ordinal() == carta4.getValor().ordinal()){
                        System.out.println("Empate");
                        System.out.println("Seus pontos: " + seusPontos);
                        System.out.println("Pontos adversario: " + ptAdver);
                    }else{
                        System.out.println("Ponto para o adversario");
                        ptAdver ++;
                        System.out.println("Seus pontos: " + seusPontos);
                        System.out.println("Pontos adversario: " + ptAdver);
                    }
                    carta1 = null;
                break;
                
                case 2:
                    System.out.println();
                    System.out.println("Carta jogada: " + carta2);
                    System.out.println("Carta do adversario: " + carta5);

                    if(carta2 == null){
                        System.out.println("Carta ja foi jogada, tente outra");
                    }else if(carta2.getValor().ordinal() + 1 > carta5.getValor().ordinal()){
                        System.out.println("Voce ganhou a rodada! ");
                        seusPontos2 ++;
                        System.out.println("Seus pontos: " + seusPontos2);
                        System.out.println("Pontos adversario: " + ptAdver2);
                    }else if(carta5.getValor().ordinal() + 1 > carta2.getValor().ordinal()){
                        System.out.println("Ponto para o adversario");
                        ptAdver2 ++;
                        System.out.println("Seus pontos: " + seusPontos2);
                        System.out.println("Pontos adversario: " + ptAdver2);
                    }else if(carta2.getValor().ordinal()> carta5.getValor().ordinal()){
                        System.out.println("Voce ganhou a rodada! ");
                        seusPontos2 ++;
                        System.out.println("Seus pontos: " + seusPontos2);
                        System.out.println("Pontos adversario: " + ptAdver2);
                    }else if(carta2.getValor().ordinal() == carta5.getValor().ordinal()){
                        System.out.println("Empate");
                        System.out.println("Seus pontos: " + seusPontos2);
                        System.out.println("Pontos adversario: " + ptAdver2);
                    }else{
                        System.out.println("Ponto para o adversario");
                        ptAdver2 ++;
                        System.out.println("Seus pontos: " + seusPontos2);
                        System.out.println("Pontos adversario: " + ptAdver2);
                    }
                    carta2 = null;
                break;
    
                case 3:
                    System.out.println();
                        System.out.println("Carta jogada: " + carta3);
                        System.out.println("Carta do adversario: " + carta6);

                        if(carta3 == null){
                            System.out.println("Carta ja foi jogada, tente outra");
                        }else if(carta3.getValor().ordinal() + 1 > carta6.getValor().ordinal()){
                            System.out.println("Voce ganhou a rodada! ");
                            seusPontos3 ++;
                            System.out.println("Seus pontos: " + seusPontos3);
                            System.out.println("Pontos adversario: " + ptAdver3);
                        }else if(carta6.getValor().ordinal() + 1 > carta3.getValor().ordinal()){
                            System.out.println("Ponto para o adversario");
                            ptAdver3 ++;
                            System.out.println("Seus pontos: " + seusPontos3);
                            System.out.println("Pontos adversario: " + ptAdver3);
                        }else if(carta3.getValor().ordinal()> carta6.getValor().ordinal()){
                            System.out.println("Voce ganhou a rodada! ");
                            seusPontos3 ++;
                            System.out.println("Seus pontos: " + seusPontos3);
                            System.out.println("Pontos adversario: " + ptAdver3);
                        }else if(carta3.getValor().ordinal() == carta6.getValor().ordinal()){
                            System.out.println("Empate");
                            System.out.println("Seus pontos: " + seusPontos3);
                            System.out.println("Pontos adversario: " + ptAdver3);
                        }else{
                            System.out.println("Ponto para o adversario");
                            ptAdver3 ++;
                            System.out.println("Seus pontos: " + seusPontos3);
                            System.out.println("Pontos adversario: " + ptAdver3);
                        }
                        carta3 = null;
                break;
    
                default:
                    System.out.println("opcao invalida");
            }
        return opcs;
    }
}