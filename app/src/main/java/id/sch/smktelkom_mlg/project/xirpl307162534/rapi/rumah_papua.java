package id.sch.smktelkom_mlg.project.xirpl307162534.rapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class rumah_papua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah_papua);

        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();}
        });
    }
}
