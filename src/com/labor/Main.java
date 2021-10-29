package com.labor;

import test.BenutzerTest;

public class Main {

    public static void main(String[] args) {
        BenutzerTest test = new BenutzerTest();
        test.setUp();
        test.testGetters();
        test.testSetters();
        test.sportartZeitTest();
        test.kalkuliereZeitTest();
        test.kalkuliereDurchschnittsZeitTest();
    }
}
