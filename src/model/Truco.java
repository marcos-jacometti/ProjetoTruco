package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Truco {
    public static List<Carta> lista = new ArrayList<>();
    public static void main(String[] args) {
       Truco tr = new Truco();
       Scanner sc = new Scanner(System.in);
       int opcs = 0;
       do{
        opcs = menu(tr, sc);
       }while(opcs!=4);
    }

    public static int menu(Truco tr, Scanner sc){
        Baralho baralho = new Baralho();
        baralho.embaralhar();
        System.out.println();

        Carta carta1, carta2, carta3, vira;
        carta1 = baralho.retirarUmCarta();
        carta2 = baralho.retirarUmCarta();
        carta3 = baralho.retirarUmCarta();
        vira = baralho.retirarUmCarta();
        
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
        System.out.println("3. Jogar carta: " + carta3);
        System.out.println("Digite sua opcao: ");
        opcs = Integer.parseInt(sc.nextLine());
        int seusPontos = 0;
        int ptAdver = 0;

        switch(opcs){
            case 1:
                System.out.println("Carta jogada: " + carta1);
                Carta carta4;
                carta4 = baralho.retirarUmCarta();
                System.out.println("Carta do adversario: " + carta4);

                if(carta1.getValor().ordinal() > carta4.getValor().ordinal()){
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
            break;
            
            case 2:
                
            break;

            case 3:
                
            break;

            default:
                System.out.println("opcao invalida");
        }
        return opcs;
    }
}