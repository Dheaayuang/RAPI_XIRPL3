package id.sch.smktelkom_mlg.project.xirpl307162534.rapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class kalimantan extends AppCompatActivity {


    ImageButton btnRumahKalimantan;
    ImageButton btnBajuKalimantan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimantan);


        btnRumahKalimantan = (ImageButton) findViewById(R.id.btnRumahKalimantan);
        btnBajuKalimantan = (ImageButton) findViewById(R.id.btnBajuKalimantan);

        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kalimantan.this, MainActivity.class));
            }
        });

        findViewById(R.id.btnRumahKalimantan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kalimantan.this, rumah_kalimantan.class));
            }
        });

        findViewById(R.id.btnBajuKalimantan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kalimantan.this, baju_kalimantan.class));
            }
        });

        findViewById(R.id.btnLaguKalimantan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kalimantan.this, lagu_kalimantan.class));
            }
        });
}}
