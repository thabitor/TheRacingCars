package com.example.racingcars.model;

import java.util.ArrayList;

public class Driver {
    private String nom;
    private Voiture voiture;
    private ArrayList<Double> listeTemps;

    public Driver(String nom, Voiture voiture) {
        this.nom = nom;
        this.voiture = voiture;
        this.listeTemps = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }


    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
    
    public ArrayList<Double> getListeTemps() {
        return listeTemps;
    }

    public void faireUnTour(Circuit circuit) {
        double distance = circuit.getCircuitLength();
        int vitesse = voiture.ObternirVitesse();
        double temps = 3600 * (distance/vitesse);
        listeTemps.add(temps);
    }

    public double calculTempsTotal() {

        double totalTime = 0;
        for (int i = 0; i < listeTemps.size() - 1; i++) {
            totalTime += listeTemps.get(i);
        } return totalTime;
    }


}
