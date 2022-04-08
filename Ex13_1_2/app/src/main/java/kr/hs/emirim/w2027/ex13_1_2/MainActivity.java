package kr.hs.emirim.w2027.ex13_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    MediaPlayer media;
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        media = MediaPlayer.create(this, R.raw.havealittlefun);
        switch1 = findViewById(R.id.switch1);
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switch1.isChecked()){
                    media.start();
                }else{
                    media.stop();
                }
            }
        });
    }
}