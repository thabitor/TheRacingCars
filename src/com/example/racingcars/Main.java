package com.example.racingcars;

import com.example.racingcars.model.*;

public class Main {
    public static void main(String[] args) {

        Voiture car1 = new Voiture("Apex", "AP-0", 220, 280);
        Voiture car2 = new Voiture("Bentley", "Bentayga Speed 2021", 220, 280);
        Voiture car3 = new Voiture("BMW", "X7-M60i", 220, 280);
        Voiture car4 = new Voiture("BMW", "iX", 220, 280);
        Voiture car5 = new Voiture("McLaren", "Altura 2022", 220, 280);

        Driver driver1 = new Driver("Andretti", car1);
        Driver driver2 = new Driver("Schumacher", car2);
        Driver driver3 = new Driver("Prost", car3);
        Driver driver4 = new Driver("Johnson", car4);
        Driver driver5 = new Driver("Lauda", car5);

        Circuit albertPark = new Circuit("Albert Park Circuit", 5.279);
        Circuit algarve = new Circuit("Autódromo Internacional do Algarve", 4.65);
        Circuit bakkuCity = new Circuit("Baku City Circuit", 6.003);

        Race race1 = new Race("Need For Speed", albertPark, 3);
        Race race2 = new Race("Hunger Games", algarve, 1.5);
        Race race3 = new Race("Furious Cars", bakkuCity, 2);

        race1.addDriver(driver1);
        race1.addDriver(driver2);
        race1.addDriver(driver3);

        race1.Go();

        for (int i = 1; i <= race1.getNbrTours(); i++) {
            race1.afficherUnTour(i);
        }

       race1.findWinner();

    }
}
