package kr.hs.emirim.w2027.dir6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper fLipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fLipper = findViewById(R.id.flipper);
        Button btnStart = findViewById(R.id.btn_start);
        Button btnStop = findViewById(R.id.btn_stop);

        fLipper.setFlipInterval(1000); //밀리세컨드 단위
        btnStart.setOnClickListener(btnListener);
        btnStop.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_start:
                    fLipper.startFlipping();
                    break;
                case R.id.btn_stop:
                    fLipper.stopFlipping();
                    break;
            }
        }
    };
}