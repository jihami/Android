package kr.hs.emirim.w2027.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class StopWatch_3 extends AppCompatActivity {
    private Chronometer chronometer;
    private boolean running;
    private long pauseoffset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch_3);

        chronometer = findViewById(R.id.chronometer);
        chronometer.setFormat("시간 : %s");

        Button btnStart = findViewById(R.id.btn_start);
        Button btnStop = findViewById(R.id.btn_stop);
        Button btnReset = findViewById(R.id.btn_reset);

    //시작
    btnStart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(!running){
                chronometer.setBase(SystemClock.elapsedRealtime() - pauseoffset);
                chronometer.start();
                running = true;
            }
        }
    });

    //중지
    btnStop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(running){
                chronometer.stop();
                pauseoffset = SystemClock.elapsedRealtime() - chronometer.getBase();
                running = false;
            }
        }
    });

    //초기화
    btnReset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            chronometer.setBase(SystemClock.elapsedRealtime());
            pauseoffset = 0;
        }
    });
    }
}