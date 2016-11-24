package id.sch.smktelkom_mlg.project.xirpl307162534.rapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class bali extends AppCompatActivity {

    ImageButton btnBack;
    ImageButton btnRumahBali;
    ImageButton btnBajuBali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bali);

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnRumahBali = (ImageButton) findViewById(R.id.btnRumahBali);
        btnBajuBali = (ImageButton) findViewById(R.id.btnBajuBali);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bali.this, MainActivity.class));
            }
        });

        btnRumahBali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bali.this, rumah_bali.class));
            }
        });

        btnBajuBali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bali.this, baju_bali.class));
            }
        });

        findViewById(R.id.btnLaguBali).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bali.this, lagu_bali.class));
            }
        });
    }


}
