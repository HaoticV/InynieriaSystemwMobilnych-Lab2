package com.example.cyklyciaaktywnoci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity0 extends AppCompatActivity {
    private EditText poleTekstowe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity0);
        Aplikacja.aktywnosc0 = this;
        poleTekstowe = (EditText) findViewById(R.id.L0_poleTekstowe);
        String msg = getString(R.string.A0_intro);
        msg += getString(R.string.onCreateMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);

    }

    @Override
    protected void onStart() {
        super.onStart();
        String msg = getString(R.string.A0_intro);
        msg += getString(R.string.onStartMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String msg = getString(R.string.A0_intro);
        msg += getString(R.string.onResumeMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }

    @Override
    protected void onPause() {
        super.onPause();
        String msg = getString(R.string.A0_intro);
        msg += getString(R.string.onPauseMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }

    @Override
    protected void onStop() {
        super.onStop();
        String msg = getString(R.string.A0_intro);
        msg += getString(R.string.onStopMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String msg = getString(R.string.A0_intro);
        msg += getString(R.string.onDestroyMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        String msg = getString(R.string.A0_intro);
        msg += getString(R.string.onRestartMsg);
        msg += '\n';
        poleTekstowe.setText(poleTekstowe.getText() + msg);
        Aplikacja.dodajDoNapisu0(msg);
    }


    public void A0Button0Click(View view) {
        Intent druga = new Intent(this, Activity1.class);
        startActivity(druga);
    }

    public void A0Button1Click(View view) {
        if (Aplikacja.aktywnosc1 == null) return;
        else Aplikacja.aktywnosc1.finish();
        poleTekstowe.setText(poleTekstowe.getText()+"----> Zakończono drugą");
    }

    public void A0Button2Click(View view) {
        poleTekstowe.setText(Aplikacja.zwrocNapis0());
    }
}
