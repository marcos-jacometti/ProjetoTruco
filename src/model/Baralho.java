package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.enumerated.Naipe;
import model.enumerated.Valor;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();
  
    public Baralho(){
        for(Valor valor : Valor.values()){
            for(Naipe naipe : Naipe.values()){
                Carta carta = new Carta();
                carta.setNaipe(naipe);
                carta.setValor(valor);
                cartas.add(carta);
            }
        }
    }

    public List<Carta> zerarBaralho(List<Carta> newBaralho){
        for(Valor valor : Valor.values()){
            for(Naipe naipe : Naipe.values()){
                Carta carta = new Carta();
                carta.setNaipe(naipe);
                carta.setValor(valor);
                newBaralho.add(carta);
            }
        }
        return newBaralho;
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public Carta retirarUmCarta() {
        Collections.shuffle(cartas);
        return cartas.remove(0);
    }
}