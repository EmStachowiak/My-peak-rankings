package com.majastachowiak;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class MountainPeak {

    private int id;
    private String mountainPeak;
    private int height;
    private int verticalGain;
    private float distance;

    public MountainPeak(String mountainPeak, int height, int verticalGain, float distance) {
        this.id=0;
        this.mountainPeak = mountainPeak;
        this.height = height;
        this.verticalGain = verticalGain;
        this.distance = distance;
    }

    public void displayTrip() {
        System.out.println("Numer ID wycieczki: " + id);
        System.out.println("Nazwa szczytu: " + mountainPeak);
        System.out.println("Wysokość: " + height);
        System.out.println("Przewyższenie: " + verticalGain);
        System.out.println("Odległość w kilometrach: " + distance);
        System.out.println();

    }
    public void displayHighestRanking() {
        System.out.println("SZCZYT: " + mountainPeak + " \tWYSOKOŚĆ: " + height + " m n.p.m.");

    }
    public void displayVerticalGainRanking() {
        System.out.println("SZCZYT: " + mountainPeak + " \tPRZEWYŻSZENIE: " + verticalGain + " metrów");
    }

    public void displayDistanceRanking() {
        System.out.println("SZCZYT: " + mountainPeak + " \tODLEGŁOŚĆ: " + distance + " kilometrów");
    }

    public void mostDifficultTrip() {
        System.out.println("SZCZYT: " + mountainPeak + " \tPRZEWYŻSZENIE: " + verticalGain + " metrów"
                + " \tODLEGŁOŚĆ: " + distance + " kilometrów"
                + "\tWYSOKOŚĆ SZCZYTU: " + height + " m n.p.m."
                );
    }

    @Override
    public String toString() {
        return "SZCZYT: " + mountainPeak + " \tPRZEWYŻSZENIE: " + verticalGain + " metrów"
                + " \tODLEGŁOŚĆ: " + distance + " kilometrów"
                + "\tWYSOKOŚĆ SZCZYTU: " + height + " m n.p.m.";

    }
}

