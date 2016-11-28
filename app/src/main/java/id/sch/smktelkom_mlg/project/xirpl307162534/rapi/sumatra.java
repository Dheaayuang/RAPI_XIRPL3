package id.sch.smktelkom_mlg.project.xirpl307162534.rapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class sumatra extends AppCompatActivity {

    ImageButton btnBack;
    ImageButton btnRumahSumatera;
    ImageButton btnBajuSumatera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumatra);

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnRumahSumatera = (ImageButton) findViewById(R.id.BtnRumahSumatera);
        btnBajuSumatera = (ImageButton) findViewById(R.id.btnBajuSumatra);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();}
        });

        btnRumahSumatera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sumatra.this, rumah_sumatera.class));
            }
        });

        btnBajuSumatera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sumatra.this, baju_sumatera.class));
            }
        });

        findViewById(R.id.btnLaguSumatera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sumatra.this, lagu_sumatera.class));
            }
        });

    }
}
