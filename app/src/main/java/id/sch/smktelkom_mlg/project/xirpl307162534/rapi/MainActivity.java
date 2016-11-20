package id.sch.smktelkom_mlg.project.xirpl307162534.rapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btbali;
    ImageButton btjawa;
    ImageButton btkalimantan;
    ImageButton btpapua;
    ImageButton btsulawesi;
    ImageButton btsumatra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btbali = (ImageButton) findViewById(R.id.btnBali);
        btjawa = (ImageButton) findViewById(R.id.btnJawa);
        btkalimantan = (ImageButton) findViewById(R.id.btnKalimantan);
        btpapua = (ImageButton) findViewById(R.id.btnPapua);
        btsulawesi = (ImageButton) findViewById(R.id.btnSulawesi);
        btsumatra = (ImageButton) findViewById(R.id.btnSumatera);

        btbali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, bali.class));
            }
        });
    }
}
