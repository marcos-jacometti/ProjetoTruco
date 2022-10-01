package model.controller;

import java.util.ArrayList;
import java.util.List;

import model.Carta;
import model.DistribuirCartas;
import model.Pontos;
import model.Turno;

public class PartidaController {
    private static List<Carta> cartas = new ArrayList<>();
    
    public static int caseCarta1(){
        System.out.println();
        System.out.println("Carta Adversario: " + DistribuirCartas.carta4);
        System.out.println();

        if(DistribuirCartas.carta1 == null){
            System.out.println("***Carta ja foi jogada, tente outra***");
        }else if(Pontos.somarPontos == 2){
            Pontos.somarTentos++;
            Turno.rodada = 0;
            DistribuirCartas.distribuirCartas();
            System.out.println("Voce ganhou a queda");
        }else if(Pontos.SomarPtsAdv == 2){
            Pontos.somarTentosAd++;
            Turno.rodada = 0;
            DistribuirCartas.distribuirCartas();
            System.out.println("***Voce perdeu a queda***");
        }else if(DistribuirCartas.carta1.getValor().ordinal() > DistribuirCartas.carta4.getValor().ordinal()){
            System.out.println("Rodada ganha");
            Pontos.somarPontos++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta1.getValor().ordinal() == DistribuirCartas.carta4.getValor().ordinal()){
            System.out.println("Empate");
            Turno.rodada++;
        }else{
            System.out.println("Voce perdeu");
            Pontos.SomarPtsAdv++;
            Turno.rodada++;
        }
        cartas.add(DistribuirCartas.carta1);
        cartas.add(DistribuirCartas.carta4);
        DistribuirCartas.carta1 = null;
        return 0;
    }

    public static int caseCarta2(){
        System.out.println();
        System.out.println("Carta Adversario: " + DistribuirCartas.carta5);
        System.out.println();

        if(DistribuirCartas.carta2 == null){
            System.out.println("***Carta ja foi jogada, tente outra***");
        }else if(Pontos.somarPontos == 2){
            Pontos.somarTentos++;
            Turno.rodada = 0;
            DistribuirCartas.distribuirCartas();
            System.out.println("Voce ganhou a queda");
        }else if(Pontos.SomarPtsAdv == 2){
            Pontos.somarTentosAd++;
            Turno.rodada = 0;
            DistribuirCartas.distribuirCartas();
            System.out.println("***Voce perdeu a queda***");
        }else if(DistribuirCartas.carta2.getValor().ordinal() > DistribuirCartas.carta5.getValor().ordinal()){
            System.out.println("Rodada ganha");
            Pontos.somarPontos++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta2.getValor().ordinal() == DistribuirCartas.carta5.getValor().ordinal()){
            System.out.println("Empate");
            Turno.rodada++;
        }else{
            System.out.println("Voce perdeu");
            Pontos.SomarPtsAdv++;
            Turno.rodada++;
        }
        cartas.add(DistribuirCartas.carta2);
        cartas.add(DistribuirCartas.carta5);
        DistribuirCartas.carta2 = null;
        return 0;
    }

    public static int caseCarta3(){
        System.out.println();
        System.out.println("Carta Adversario: " + DistribuirCartas.carta6);
        System.out.println();

        if(DistribuirCartas.carta3 == null){
            System.out.println("***Carta ja foi jogada, tente outra***");
        }else if(Pontos.somarPontos == 2){
            Pontos.somarTentos++;
            Turno.rodada = 0;
            DistribuirCartas.distribuirCartas();
            System.out.println("Voce ganhou a queda");
        }else if(Pontos.SomarPtsAdv == 2){
            Pontos.somarTentosAd++;
            Turno.rodada = 0;
            DistribuirCartas.distribuirCartas();
            System.out.println("***Voce perdeu a queda***");
        }else if(DistribuirCartas.carta3.getValor().ordinal() > DistribuirCartas.carta6.getValor().ordinal()){
            System.out.println("Rodada ganha");
            Pontos.somarPontos++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta3.getValor().ordinal() == DistribuirCartas.carta6.getValor().ordinal()){
            System.out.println("Empate");
            Turno.rodada++;
        }else{
            System.out.println("Voce perdeu");
            Pontos.SomarPtsAdv++;
            Turno.rodada++;
        }
        cartas.add(DistribuirCartas.carta3);
        cartas.add(DistribuirCartas.carta6);
        DistribuirCartas.carta3 = null;
        return 0;
    }

    public static int case4(){
        System.out.println("***Truco Marreco***");
        
        return 0;
    }

    public static int case5(){
        System.out.println();
        System.out.println("Ponto para o adversario");
        Pontos.somarTentosAd++;
        Turno.rodada = 0;
        DistribuirCartas.distribuirCartas();
        System.out.println();
        return 0;
    }
}