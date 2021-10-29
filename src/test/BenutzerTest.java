package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.labor.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BenutzerTest {
    Benutzer benutzer;

    @BeforeEach
    public void setUp() {
        benutzer = new Benutzer("Vorname","Nachname");
    }

    @Test
    @DisplayName("Getters test")
    public void testGetters(){
        List<Sport> sportList = new ArrayList<>();
        assertEquals("Nachname", benutzer.getNachname(), "Nachname getter testen");
        assertEquals("Vorname", benutzer.getVorname(), "Vorname getter testen");
        assertEquals(sportList, benutzer.getSportList(), "Sport Liste getter testen");
    }

    @Test
    @DisplayName("Setters test")
    public void testSetters() {
        List<Sport> sportList = new ArrayList<>();
        Fussball fussball = new Fussball();
        sportList.add(fussball);

        benutzer.setNachname("NeueNachname");
        benutzer.setVorname("NeueVorname");
        benutzer.setSport(sportList);

        assertEquals("NeueNachname", benutzer.getNachname(), "Nachname setter testen");
        assertEquals("NeueVorname", benutzer.getVorname(), "Vorname setter testen");
        assertEquals(sportList, benutzer.getSportList(), "Sport Liste setter testen");
    }

    @Test
    @DisplayName("Sportart Zeiten testen")
    public void sportartZeitTest(){

        Basketball basketball = new Basketball();
        Fussball fussball = new Fussball();
        Hindernislauf hindernislauf = new Hindernislauf();
        Hochsprung hochsprung = new Hochsprung();
        Leichtathletik leichtathletik = new Leichtathletik();
        Mannschaftssport mannschaftssport = new Mannschaftssport();

        assertEquals(55, benutzer.kalkuliereZeit(basketball), "Basketball Zeit");
        assertEquals(65, benutzer.kalkuliereZeit(fussball), "Fussball Zeit");
        assertEquals(30, benutzer.kalkuliereZeit(hindernislauf), "Hindernislauf Zeit");
        assertEquals(20, benutzer.kalkuliereZeit(hochsprung), "Hochsprung Zeit");
        assertEquals(25, benutzer.kalkuliereZeit(leichtathletik),"Leichtathletik Zeit");
        assertEquals(60, benutzer.kalkuliereZeit(mannschaftssport), "Mannschaftssport Zeit");

    }

    @Test
    @DisplayName("Kalkuliere DurchschnittsZeit testen")
    public void kalkuliereDurchschnittsZeitTest(){
        Basketball basketball = new Basketball();   //55
        Fussball fussball = new Fussball();         //65
        Hindernislauf hindernislauf = new Hindernislauf();  //30
        Hochsprung hochsprung = new Hochsprung();       //20

        List<Sport> sportList = new ArrayList<>();
        sportList.add(basketball);
        sportList.add(fussball);

        benutzer.setSport(sportList);
        assertEquals(60,benutzer.kalkuliereDurchschnittszeit(), "55 + 65 / 2 = 60");

        sportList.add(hindernislauf);
        sportList.add(hochsprung);

        benutzer.setSport(sportList);
        assertEquals(42.5, benutzer.kalkuliereDurchschnittszeit(), "55 + 65 + 30 + 20 / 4  = 42.5");

    }

    @Test
    @DisplayName("Kalkuliere Zeit testen")
    public void kalkuliereZeitTest(){
        Basketball basketball = new Basketball();   //55
        Fussball fussball = new Fussball();         //65
        Hindernislauf hindernislauf = new Hindernislauf();  //30
        Hochsprung hochsprung = new Hochsprung();       //20

        List<Sport> sportList = new ArrayList<>();
        sportList.add(basketball);
        sportList.add(fussball);

        benutzer.setSport(sportList);
        assertEquals(120,benutzer.kalkuliereZeit(), "55 + 65 = 120");

        sportList.add(hindernislauf);
        sportList.add(hochsprung);

        benutzer.setSport(sportList);
        assertEquals(170, benutzer.kalkuliereZeit(), "55 + 65 + 30 + 20 = 170");

    }

}