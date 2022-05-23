package com.example.racingcars.model;

public class Circuit {

    private String circuitName;
    private double circuitLength;

    public Circuit(String circuitName, double circuitLength) {
        this.circuitLength = circuitLength;
        this.circuitName = circuitName;
    }

    public String getCircuitName() {
        return circuitName;
    }

    public double getCircuitLength() {
        return circuitLength;
    }

    public void setCircuitLength(double circuitLength) {
        this.circuitLength = circuitLength;
    }
}
