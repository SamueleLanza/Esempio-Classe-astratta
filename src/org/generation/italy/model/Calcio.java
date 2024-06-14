package org.generation.italy.model;

public class Calcio extends Partita {

    public Calcio(String squadraCasa, String squadraOspite, String risultato) {
        super(squadraCasa, squadraOspite, risultato);
    }

    @Override
    public void stampaRisultato() {
        System.out.println(getSquadraCasa() + " - " + getSquadraOspite() + " (" + getRisultato() + ")");
    }
}

