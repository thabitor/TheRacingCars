package com.example.racingcars.model;

import java.util.*;

public class Voiture {

    private String marque;
    private String modele;
    private int vitesseMin;
    private int vitesseMax;

    public Voiture(String marque, String modele, int vitesseMin, int vitesseMax) {
        this.modele = modele;
        this.marque = marque;
        this.vitesseMin = vitesseMin;
        this.vitesseMax = vitesseMax;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getVitesseMin() {
        return vitesseMin;
    }

    public void setVitesseMin(int vitesseMin) {
        this.vitesseMin = vitesseMin;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public int ObternirVitesse() {
        int vitesse;
        Random rand = new Random();
        vitesse = rand.nextInt(vitesseMin, vitesseMax);
        return vitesse;

    }

    public void ajouterVitesseMax(int vitesseMax) {
        int newVitesse = getVitesseMax() + 20;
        vitesseMax += newVitesse;
        ObternirVitesse();
    }
}
