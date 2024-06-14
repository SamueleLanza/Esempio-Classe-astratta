package org.generation.italy;

import org.generation.italy.model.Calcio;
import org.generation.italy.model.Partita;

public class Main {
	public static void main(String[] args) {
		
		Partita[] partite = new Partita[]{
	            new Calcio("Milan", "Inter", "1-0"),
	            new Calcio("Juventus", "Roma", "2-1")
	        };

	        for (Partita partita : partite) {
	            partita.stampaRisultato();
	        }
	    }
	}