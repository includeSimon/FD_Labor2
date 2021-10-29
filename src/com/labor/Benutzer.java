package com.labor;

import java.util.ArrayList;
import java.util.List;

public class Benutzer implements Sport{
    //Attributen
    private String vorname;
    private String nachname;
    private List<Sport> sportList = new ArrayList<>();

    //2 Konstruktoren
    public Benutzer(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Benutzer(String vorname, String nachname, Sport sport){
        this(vorname, nachname);        //Aufruf Konstructor 1
        sportList.add(sport);
    }

    //Getters und setters
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public List<Sport> getSportList() {
        return sportList;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setSport(List<Sport> sport) {
        this.sportList = sport;
    }

    //setSport overloading, s.d. wir konnen nur eine SportArt ein
    public void setSport(Sport sport){
        sportList.clear();
        sportList.add(sport);
    }

    public void addSport(Sport sport){
        this.sportList.add(sport);
    }

    public void removeSport(Sport sport){
        this.sportList.remove(sport);
    }


    @Override
    /***
     * Wir werden alle Sportarten Zeiten zusammenfassen
     * @return gemeinsamZeit Die Zeitsumme aller SportArten
     */
    public double kalkuliereZeit(){
        double gemeinsamZeit = 0;

        for (Sport sport : sportList)
            gemeinsamZeit += sport.kalkuliereZeit();

        return gemeinsamZeit;
    }

    /***
     * Die Methode gibt die Zeit des Sports zurück
     * @param sport den Sport, für den wir die Zeit finden wollen
     * @return die Zeit den Sport
     */
    public double kalkuliereZeit(Sport sport){
        return sport.kalkuliereZeit();
    }

    /***
     *Es werdet addieren alle Zeiten und teilen sie durch die Anzahl der Sportarten
     * @return Die Durchschnittszeit aller Noten
     */
    public double kalkuliereDurchschnittszeit(){
        double gemeinsamZeit = kalkuliereZeit();

        return gemeinsamZeit / sportList.size();
    }
}