package com.example.mywatchdonttouch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mywatchdonttouch.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }


    public void toFormul(View view) {
        Intent Formul = new Intent(this , FormulSocrashUmnog.class);
        startActivity(Formul);
    }

    public void toKvadrat(View view) {
        Intent Kvadrat = new Intent(this , KvadratnoeUmnog.class);
        startActivity(Kvadrat);
    }

    public void Para(View view) {
        Intent Para = new Intent(this , Parabola.class);
        startActivity(Para);

    }

    public void Svoystvo(View view) {
        Intent Svo = new Intent(this , SvoystvaStepenye.class);
        startActivity(Svo);
    }
}