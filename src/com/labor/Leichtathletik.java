package com.labor;

public class Leichtathletik implements Sport{
    @Override
    public double kalkuliereZeit() {
        return 25;      //Hindernislauf Zeit + Hochsprung Zeit geteilt durch 2
    }
}
