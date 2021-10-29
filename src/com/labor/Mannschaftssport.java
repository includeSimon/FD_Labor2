package com.labor;

public class Mannschaftssport implements Sport{
    @Override
    public double kalkuliereZeit() {
        return 60;      //Basketball Zeit + Fussbal Zeit geteilt durch 2
    }
}
