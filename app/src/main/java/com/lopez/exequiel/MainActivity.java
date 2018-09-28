package com.lopez.exequiel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View v){
        Intent i = null, chooser=null;
        if(v.getId() == R.id.button) {
            i = new Intent(MainActivity.this, LopezExequielLab5.class);
            MainActivity.this.startActivity(i);
        }
        else if(v.getId() == R.id.button2) {
            Uri g = Uri.parse("geo: 14.617657, 121.002123");
            i = new Intent(Intent.ACTION_VIEW, g);
            chooser = Intent.createChooser(i, "Select an application");
            startActivity(chooser);
        }
    }
}
