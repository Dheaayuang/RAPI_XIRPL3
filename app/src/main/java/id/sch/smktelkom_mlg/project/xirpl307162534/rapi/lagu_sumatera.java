package id.sch.smktelkom_mlg.project.xirpl307162534.rapi;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;

public class lagu_sumatera extends AppCompatActivity {

    ImageButton buttonBack;

    private ImageButton btnPlay;
    private ImageButton btnPause;
    private ImageButton btnStop;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_sumatera);

        buttonBack = (ImageButton) findViewById(R.id.btnBack);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*startActivity(new Intent(lagu_sumatera.this, sumatra.class));
        */
            onBackPressed();}
        });

        //button play begin

        mp = new MediaPlayer();
        btnPlay = (ImageButton) findViewById(R.id.btnPLAY);
        btnPause = (ImageButton) findViewById(R.id.btnPAUSE);
        btnStop = (ImageButton) findViewById(R.id.btnSTOP);


        stateAwal();

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
                btnPlay.setEnabled(false);
                btnPause.setEnabled(true);
                btnStop.setEnabled(true);
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });
    }

    private void stateAwal() {
        btnPlay.setEnabled(true);
        btnPause.setEnabled(false);
        btnStop.setEnabled(false);
    }

    private void play() {
        mp = MediaPlayer.create(this, R.raw.sumatera);

        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        mp.start();


        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }

    private void pause() {

        if (mp.isPlaying()) {
            if (mp != null) {
                mp.pause();
            }
        } else {
            if (mp != null) {
                mp.start();
            }
        }
    }

    private void stop() {

        mp.stop();
        try {
            mp.prepare();
            mp.seekTo(0);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        stateAwal();

    }
}
