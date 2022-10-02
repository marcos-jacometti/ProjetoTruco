package model.enumerated;

import model.Carta;

public enum Valor {
    Quatro, Cinco, Seis, Sete, Damas, Valete, Reis, As, Dois, Tres;

    public int ordinal(int i) {
        return 0;
    }

    public void valueOf(Carta carta1) {
    }
}