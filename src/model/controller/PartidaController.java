package model.controller;

import model.DistribuirCartas;
import model.Pontos;
import model.Truco;
import model.Turno;

public class PartidaController {    
    public static int caseCarta1(){
        System.out.println();
        System.out.println("Sua Carta: " + DistribuirCartas.carta1);
        System.out.println("Carta Adversario: " + DistribuirCartas.carta4);
        System.out.println();
       
        if(DistribuirCartas.carta1 == null){
            System.out.println("***Carta ja foi jogada, tente outra***");
        }else if(Turno.rodada == 1 && DistribuirCartas.carta1.getValor().ordinal() == DistribuirCartas.carta4.getValor().ordinal()){
            System.out.println("Empate, mostre sua maior carta");
            Turno.rodada++;
            if(DistribuirCartas.carta2.getValor().ordinal() >= DistribuirCartas.carta6.getValor().ordinal() ||
               DistribuirCartas.carta3.getValor().ordinal() >= DistribuirCartas.carta6.getValor().ordinal()){
                Pontos.somarTentos++;
                Turno.rodada = 1;
                DistribuirCartas.distribuirCartas();
                Pontos.somarPontos = 0;
                System.out.println("***Voce ganhou a rodada***");
            }else{
                Pontos.somarTentosAd++;
                Turno.rodada = 1;
                DistribuirCartas.distribuirCartas();
                Pontos.SomarPtsAdv = 0;
                System.out.println("***Voce perdeu a rodada***");
            }
        }else if(DistribuirCartas.carta1.getValor().ordinal() == DistribuirCartas.manilha && DistribuirCartas.carta4.getValor().ordinal() == DistribuirCartas.manilha){
            if(DistribuirCartas.carta1.getNaipe().ordinal() > DistribuirCartas.carta4.getNaipe().ordinal()){
                System.out.println("Rodada ganha");
                Pontos.somarPontos++;
                Pontos.SomarPtsTruco++;
                Turno.rodada++;
            }else{
                System.out.println("Voce perdeu");
                Pontos.SomarPtsAdv++;
                Pontos.SomarPtsTrucoAd++;
                Turno.rodada++;
            }
        }else if(DistribuirCartas.carta1.getValor().ordinal() == DistribuirCartas.manilha){
            System.out.println("Rodada ganha");
            Pontos.somarPontos++;
            Pontos.SomarPtsTruco++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta4.getValor().ordinal() == DistribuirCartas.manilha){
            System.out.println("Voce perdeu");
            Pontos.SomarPtsAdv++;
            Pontos.SomarPtsTrucoAd++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta1.getValor().ordinal() > DistribuirCartas.carta4.getValor().ordinal()){
            System.out.println("Rodada ganha");
            Pontos.somarPontos++;
            Pontos.SomarPtsTruco++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta1.getValor().ordinal() == DistribuirCartas.carta4.getValor().ordinal()){
            System.out.println("Empate");
            Turno.rodada++;
        }else if(DistribuirCartas.carta1.getValor().ordinal() < DistribuirCartas.carta4.getValor().ordinal()){
            System.out.println("Voce perdeu");
            Pontos.SomarPtsAdv++;
            Pontos.SomarPtsTrucoAd++;
            Turno.rodada++;
        }
        DistribuirCartas.carta1 = null;
        if(Pontos.somarTentos == 11 && Pontos.SomarPtsAdv == 2){
            Pontos.somarTentosAd = Pontos.somarTentosAd + 3;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.SomarPtsAdv = 0;
            System.out.println("***Voce perdeu a rodada***");
        }else if(Pontos.somarTentosAd == 11 && Pontos.somarPontos == 2){
            Pontos.somarPontos = Pontos.somarPontos + 3;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.somarPontos = 0;
            System.out.println("***Voce ganhou a rodada***");
        }else if(Pontos.somarPontos == 1 && Pontos.SomarPtsAdv == 1){
            Pontos.somarTentos++;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.somarPontos = 0;
            System.out.println("***Voce ganhou a rodada***");
        }else if(Pontos.somarPontos == 2){
            Pontos.somarTentos++;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.somarPontos = 0;
            System.out.println("***Voce ganhou a rodada***");
        }else if(Pontos.SomarPtsAdv == 2){
            Pontos.somarTentosAd++;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.SomarPtsAdv = 0;
            System.out.println("***Voce perdeu a rodada***");
        }
        return 0;
    }

    public static int caseCarta2(){
        System.out.println();
        System.out.println("Sua Carta: " + DistribuirCartas.carta2);
        System.out.println("Carta Adversario: " + DistribuirCartas.carta5);
        System.out.println();

        if(DistribuirCartas.carta2 == null){
            System.out.println("***Carta ja foi jogada, tente outra***");
        }else if(Turno.rodada == 1 && DistribuirCartas.carta2.getValor().ordinal() == DistribuirCartas.carta5.getValor().ordinal()){
            System.out.println("Empate, mostre sua maior carta");
            Turno.rodada++;
            if(DistribuirCartas.carta1.getValor().ordinal() >= DistribuirCartas.carta4.getValor().ordinal() ||
               DistribuirCartas.carta3.getValor().ordinal() >= DistribuirCartas.carta4.getValor().ordinal()){
                Pontos.somarTentos++;
                Turno.rodada = 1;
                DistribuirCartas.distribuirCartas();
                Pontos.somarPontos = 0;
                System.out.println("***Voce ganhou a rodada***");
            }else{
                Pontos.somarTentosAd++;
                Turno.rodada = 1;
                DistribuirCartas.distribuirCartas();
                Pontos.SomarPtsAdv = 0;
                System.out.println("***Voce perdeu a rodada***");
            }
        }else if(DistribuirCartas.carta2.getValor().ordinal() == DistribuirCartas.manilha && DistribuirCartas.carta5.getValor().ordinal() == DistribuirCartas.manilha){
            if(DistribuirCartas.carta2.getNaipe().ordinal() > DistribuirCartas.carta5.getNaipe().ordinal()){
                System.out.println("Rodada ganha");
                Pontos.somarPontos++;
                Pontos.SomarPtsTruco++;
                Turno.rodada++;
            }else{
                System.out.println("Voce perdeu");
                Pontos.SomarPtsAdv++;
                Pontos.SomarPtsTrucoAd++;
                Turno.rodada++;
            }
        }else if(DistribuirCartas.carta2.getValor().ordinal() == DistribuirCartas.manilha){
            System.out.println("Rodada ganha");
            Pontos.somarPontos++;
            Pontos.SomarPtsTruco++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta5.getValor().ordinal() == DistribuirCartas.manilha){
            System.out.println("Voce perdeu");
            Pontos.SomarPtsAdv++;
            Pontos.SomarPtsTrucoAd++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta2.getValor().ordinal() > DistribuirCartas.carta5.getValor().ordinal()){
            System.out.println("Rodada ganha");
            Pontos.somarPontos++;
            Pontos.SomarPtsTruco++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta2.getValor().ordinal() == DistribuirCartas.carta5.getValor().ordinal()){
            System.out.println("Empate");
            Turno.rodada++;
        }else if(DistribuirCartas.carta2.getValor().ordinal() < DistribuirCartas.carta5.getValor().ordinal()){
            System.out.println("Voce perdeu");
            Pontos.SomarPtsAdv++;
            Pontos.SomarPtsTrucoAd++;
            Turno.rodada++;
        }
        DistribuirCartas.carta2 = null;
        if(Pontos.somarTentos == 11 && Pontos.SomarPtsAdv == 2){
            Pontos.somarTentosAd = Pontos.somarTentosAd + 3;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.SomarPtsAdv = 0;
            System.out.println("***Voce perdeu a rodada***");
        }else if(Pontos.somarTentosAd == 11 && Pontos.somarPontos == 2){
            Pontos.somarPontos = Pontos.somarPontos + 3;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.somarPontos = 0;
            System.out.println("***Voce ganhou a rodada***");
        }else if(Pontos.somarPontos == 1 && Pontos.SomarPtsAdv == 1){
            Pontos.somarTentos++;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.somarPontos = 0;
            System.out.println("***Voce ganhou a rodada***");
        }else if(Pontos.somarPontos == 2){
            Pontos.somarTentos++;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.somarPontos = 0;
            System.out.println("***Voce ganhou a rodada***");
        }else if(Pontos.SomarPtsAdv == 2){
            Pontos.somarTentosAd++;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.SomarPtsAdv = 0;
            System.out.println("***Voce perdeu a rodada***");
        }
        return 0;
    }

    public static int caseCarta3(){
        System.out.println();
        System.out.println("Sua Carta: " + DistribuirCartas.carta3);
        System.out.println("Carta Adversario: " + DistribuirCartas.carta6);
        System.out.println();

        if(DistribuirCartas.carta3 == null){
            System.out.println("***Carta ja foi jogada, tente outra***");
        }else if(Turno.rodada == 1 && DistribuirCartas.carta3.getValor().ordinal() == DistribuirCartas.carta6.getValor().ordinal()){
            System.out.println("Empate, mostre sua maior carta");
            Turno.rodada++;
            if(DistribuirCartas.carta1.getValor().ordinal() >= DistribuirCartas.carta5.getValor().ordinal() ||
               DistribuirCartas.carta2.getValor().ordinal() >= DistribuirCartas.carta5.getValor().ordinal()){
                Pontos.somarTentos++;
                Turno.rodada = 1;
                DistribuirCartas.distribuirCartas();
                Pontos.somarPontos = 0;
                System.out.println("***Voce ganhou a rodada***");
            }else{
                Pontos.somarTentosAd++;
                Turno.rodada = 1;
                DistribuirCartas.distribuirCartas();
                Pontos.SomarPtsAdv = 0;
                System.out.println("***Voce perdeu a rodada***");
            }
        }else if(DistribuirCartas.carta3.getValor().ordinal() == DistribuirCartas.manilha && DistribuirCartas.carta6.getValor().ordinal() == DistribuirCartas.manilha){
            if(DistribuirCartas.carta3.getNaipe().ordinal() > DistribuirCartas.carta6.getNaipe().ordinal()){
                System.out.println("Rodada ganha");
                Pontos.somarPontos++;
                Pontos.SomarPtsTruco++;
                Turno.rodada++;
            }else{
                System.out.println("Voce perdeu");
                Pontos.SomarPtsAdv++;
                Pontos.SomarPtsTrucoAd++;
                Turno.rodada++;
            }
        }else if(DistribuirCartas.carta3.getValor().ordinal() == DistribuirCartas.manilha){
            System.out.println("Rodada ganha");
            Pontos.somarPontos++;
            Pontos.SomarPtsTruco++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta6.getValor().ordinal() == DistribuirCartas.manilha){
            System.out.println("Voce perdeu");
            Pontos.SomarPtsAdv++;
            Pontos.SomarPtsTrucoAd++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta3.getValor().ordinal() > DistribuirCartas.carta6.getValor().ordinal()){
            System.out.println("Rodada ganha");
            Pontos.somarPontos++;
            Pontos.SomarPtsTruco++;
            Turno.rodada++;
        }else if(DistribuirCartas.carta3.getValor().ordinal() == DistribuirCartas.carta6.getValor().ordinal()){
            System.out.println("Empate");
            Turno.rodada++;
        }else if(DistribuirCartas.carta3.getValor().ordinal() < DistribuirCartas.carta6.getValor().ordinal()){
            System.out.println("Voce perdeu");
            Pontos.SomarPtsAdv++;
            Pontos.SomarPtsTrucoAd++;
            Turno.rodada++;
        }
        DistribuirCartas.carta3 = null;
        if(Pontos.somarTentos == 11 && Pontos.SomarPtsAdv == 2){
            Pontos.somarTentosAd = Pontos.somarTentosAd + 3;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.SomarPtsAdv = 0;
            System.out.println("***Voce perdeu a rodada***");
        }else if(Pontos.somarTentosAd == 11 && Pontos.somarPontos == 2){
            Pontos.somarPontos = Pontos.somarPontos + 3;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.somarPontos = 0;
            System.out.println("***Voce ganhou a rodada***");
        }else if(Pontos.somarPontos == 1 && Pontos.SomarPtsAdv == 1){
            Pontos.somarTentos++;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.somarPontos = 0;
            System.out.println("***Voce ganhou a rodada***");
        }else if(Pontos.somarPontos == 2){
            Pontos.somarTentos++;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.somarPontos = 0;
            System.out.println("***Voce ganhou a rodada***");
        }else if(Pontos.SomarPtsAdv == 2){
            Pontos.somarTentosAd++;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            Pontos.SomarPtsAdv = 0;
            System.out.println("***Voce perdeu a rodada***");
        }
        return 0;
    }

    public static int caseTruco(){
        System.out.println("Trucoooooooooooooooo marreco");
        if(DistribuirCartas.carta4.getValor().ordinal() > DistribuirCartas.manilha ||
           DistribuirCartas.carta5.getValor().ordinal() > DistribuirCartas.manilha ||
           DistribuirCartas.carta6.getValor().ordinal() > DistribuirCartas.manilha){
                System.out.println("***Desce ladrao****");
                Truco.CaseTruco();
        }else{
            System.out.println("***To fora***");
            Pontos.somarTentos++;
            Turno.rodada = 1;
            DistribuirCartas.distribuirCartas();
            System.out.println();
        }
        return 0;
    }

    public static int caseCorrer(){
        System.out.println();
        System.out.println("Ponto para o adversario");
        Pontos.somarTentosAd++;
        Turno.rodada = 0;
        DistribuirCartas.distribuirCartas();
        System.out.println();
        return 0;
    }
}