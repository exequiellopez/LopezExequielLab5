package com.lopez.exequiel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LopezExequielLab5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lopez_exequiel_lab5);
    }
    public void onClick (View v){
        Intent i = null, chooser=null;
        if(v.getId() == R.id.button) {
            i = new Intent(LopezExequielLab5.this, MainActivity.class);
            LopezExequielLab5.this.startActivity(i);
        }
        else if(v.getId() == R.id.button2) {
            Uri g = Uri.parse("geo: 14.651602, 121.049413");
            i = new Intent(Intent.ACTION_VIEW, g);
            chooser = Intent.createChooser(i, "Select an application");
            startActivity(chooser);
        }
    }
}
