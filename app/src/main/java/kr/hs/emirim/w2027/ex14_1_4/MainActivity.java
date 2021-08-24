package kr.hs.emirim.w2027.ex14_1_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("서비스(데몬) 연습");

        intent = new Intent(this, MusicService.class);
        Button btnStart = findViewById(R.id.btn_start);
        Button btnStop = findViewById(R.id.btn_stop);

        btnStart.setOnClickListener(btnListener);
        btnStop.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_start:
                    startService(intent);
                    Log.i("서비스 테스트::", "startService() 호출");
                    break;
                case R.id.btn_stop:
                    stopService(intent);
                    Log.i("서비스 테스트::", "stopService() 호출");
                    break;
            }
        }
    };
}