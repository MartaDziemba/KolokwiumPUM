package com.example.student.kolokwiumpum;

/**
 * Created by student on 2018-01-17.
 */

public class Lekarz {

    private String imie;
    private String specjalizacja;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public Lekarz(String imie, String specjalizacja) {
        this.imie = imie;
        this.specjalizacja = specjalizacja;
    }
}
