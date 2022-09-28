package model.controller;

import model.DistribuirCartas;
import model.Pontos;
import model.Turno;

public class PartidaController {
    
    public static int caseCarta1(){
        System.out.println();
        System.out.println("Carta Adversario: " + DistribuirCartas.carta4);
        System.out.println();

        if(Pontos.somarPontos == 2){
            Pontos.somarTentos++;
            Turno.rodada = 0;
        }else if(Pontos.SomarPtsAdv == 2){
            Pontos.somarTentosAd++;
            Turno.rodada = 0;
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
        DistribuirCartas.carta1 = null;
        return 0;
    }
}
