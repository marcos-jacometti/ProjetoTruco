package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public String listarCartas(){
        StringBuilder sb = new StringBuilder();
        for(Carta carta : cartas){
            sb.append(carta).append("\n");
        }
        return sb.toString();
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public void exibir(){
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }

    public Carta retirarUmCarta() {
        Collections.shuffle(cartas);
        return cartas.remove(0);
    }
}
