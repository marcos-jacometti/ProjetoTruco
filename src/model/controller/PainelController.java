package model.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Baralho;
import model.Carta;
import model.DistribuirCartas;
import model.Pontos;
import model.Turno;

public class PainelController {
    public static List<Carta> lista = new ArrayList<>();
    public static Baralho baralho = new Baralho();
    public static void main(String[] args) {
        PainelController pc = new PainelController();
        Scanner sc = new Scanner(System.in);
        
        int op = 0;
        DistribuirCartas.distribuirCartas();
        do{
            controller(pc, sc);
        }while(op!=6);
    }

    public static int controller(PainelController pc, Scanner sc){
       
            int op;
            System.out.println();
            System.out.println("Rodada: " + Turno.rodada);
            System.out.println("Sua pontuacao: " + Pontos.somarTentos);
            System.err.println("Pontuacao do adversario: " + Pontos.somarTentosAd);
            System.out.println();
            System.out.println("vira -> " + DistribuirCartas.vira);

            System.out.println("1. " + DistribuirCartas.carta1);
            System.out.println("2. " + DistribuirCartas.carta2);
            System.out.println("3. " + DistribuirCartas.carta3);
            System.out.println("4. Pedir truco");
            System.out.println("5. Correr");
            System.out.println();
            System.out.println("Escolha: ");
            op = Integer.parseInt(sc.nextLine());

            switch(op){
                case 1:
                    PartidaController.caseCarta1();
                break;

                case 2:

                break;

                case 3:

                break;

                case 4:

                break;

                case 5:

                break;

                default:
                    System.out.println("***Opcao nao encontrada***");
            }
            return op;
        
        
    }
}