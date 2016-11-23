package id.sch.smktelkom_mlg.project.xirpl307162534.rapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class jawa extends AppCompatActivity {

    ImageButton btnBack;
    ImageButton btnRumahJawa;
    ImageButton btnBajuJawa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa);

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnRumahJawa = (ImageButton) findViewById(R.id.btnRumahJawa);
        btnBajuJawa = (ImageButton) findViewById(R.id.btnBajuJawa);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jawa.this, MainActivity.class));
            }
        });

        btnRumahJawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jawa.this, rumah_jawa.class));
            }
        });

        btnBajuJawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jawa.this, baju_jawa.class));
            }
        });

        findViewById(R.id.btnLaguJawa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jawa.this, lagu_jawa.class));
            }
        });
    }
}
