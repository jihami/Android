package kr.hs.emirim.w2027.chapter4_ex9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imgv;
int angle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRotate = findViewById(R.id.btn_rotate);
        imgv = findViewById(R.id.imgv);
        btnRotate.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            angle += 10;
            imgv.setRotation(angle);
        }
    };
}