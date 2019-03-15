package com.example.cyklyciaaktywnoci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {
    private EditText poleTekstowe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        Aplikacja.aktywnosc1 = this;
        poleTekstowe = findViewById(R.id.L1_poleTekstowe);
        String msg = getString(R.string.A1_intro);
        msg += getString(R.string.onCreateMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);

    }

    @Override
    protected void onStart() {
        super.onStart();
        String msg = getString(R.string.A1_intro);
        msg += getString(R.string.onStartMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String msg = getString(R.string.A1_intro);
        msg += getString(R.string.onResumeMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }

    @Override
    protected void onPause() {
        super.onPause();
        String msg = getString(R.string.A1_intro);
        msg += getString(R.string.onPauseMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }

    @Override
    protected void onStop() {
        super.onStop();
        String msg = getString(R.string.A1_intro);
        msg += getString(R.string.onStopMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String msg = getString(R.string.A1_intro);
        msg += getString(R.string.onDestroyMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        String msg = getString(R.string.A1_intro);
        msg += getString(R.string.onRestartMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }


    public void A1Button0Click(View view) {
        this.finish();
    }

    public void A1Button1Click(View view) {
        poleTekstowe.setText(Aplikacja.zwrocNapis1());
    }

}
