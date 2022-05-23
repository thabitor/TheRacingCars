package com.example.racingcars.model;

import java.util.*;

public class Race {

    private String nom;
    private Circuit circuit;
    private double nbrTours;
    private ArrayList<Driver> listDrivers;

    //private HashMap<Driver, Voiture> driversNCars;

    public Race(String nom, Circuit circuit, double nbrTours) {
        this.nom = nom;
        this.circuit = circuit;
        this.nbrTours = nbrTours;
        this.listDrivers = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public double getNbrTours() {
        return nbrTours;
    }

    public void addDriver(Driver driver) {
        this.listDrivers.add(driver);
    }

    public void Go() {
        for (int i = 0; i < nbrTours; i++) {
            for (Driver elem: listDrivers) {
                elem.faireUnTour(circuit);
            }
        }
    }

    public void afficherUnTour(int tour) {
        for (Driver d: listDrivers) {
            System.out.println(d.getNom() + " a fait le tour " + tour + " en " + d.getListeTemps().get(tour - 1) + " seconds");
        }
    }

    public void findWinner() {

        Driver winner = listDrivers.get(0);
        for (Driver driver : listDrivers) {
            double tempsTotal = driver.calculTempsTotal();
            if (winner.calculTempsTotal() > tempsTotal) {
                winner = driver;
            }
        }
        System.out.println("The winner is " + winner.getNom());
    }
}
