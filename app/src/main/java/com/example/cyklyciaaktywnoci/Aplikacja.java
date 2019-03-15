package com.example.cyklyciaaktywnoci;

import android.app.Activity;
import android.app.Application;

public class Aplikacja extends Application {
    private static String napis0 = "";
    private static String napis1 = "";

    public static Activity aktywnosc0;
    public static Activity aktywnosc1;

    public Aplikacja() {
        super();
        aktywnosc0 = null;
        aktywnosc1 = null;
    }

    public static void dodajDoNapisu0(String s) {
        napis0 += s;
    }

    public static void dodajDoNapisu1(String s) {
        napis1 += s;
    }

    public static String zwrocNapis0() {
        return napis0;
    }

    public static String zwrocNapis1() {
        return napis1;
    }


}
