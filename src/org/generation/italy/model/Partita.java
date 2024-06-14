package org.generation.italy.model;

public abstract class Partita {
    private String squadraCasa;
    private String squadraOspite;
    private String risultato;

    public Partita(String squadraCasa, String squadraOspite, String risultato) {
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.risultato = risultato;
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public String getRisultato() {
        return risultato;
    }

    public abstract void stampaRisultato(); // Metodo astratto
}

	
	
	
	

