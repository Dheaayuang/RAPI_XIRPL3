package id.sch.smktelkom_mlg.project.xirpl307162534.rapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class lagu_kalimantan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_kalimantan);

        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*startActivity(new Intent(lagu_kalimantan.this, kalimantan.class));
        */
            onBackPressed();}
        });
    }
}
