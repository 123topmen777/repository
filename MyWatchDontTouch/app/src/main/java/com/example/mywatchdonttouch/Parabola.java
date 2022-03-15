package com.example.mywatchdonttouch;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parabola extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parabola);
    }
    public void toMain(View view) {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}