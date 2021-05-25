package kr.hs.emirim.w2027.chap5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearDog, linearCat, linearhorse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fram);

        linearDog = findViewById(R.id.linear_dog);
        linearCat = findViewById(R.id.linear_cat);
        linearhorse = findViewById(R.id.linear_horse);

        Button btnDog = findViewById(R.id.btn_dog);
        Button btnCat = findViewById(R.id.btn_cat);
        Button btnHorse = findViewById(R.id.btn_horse);

        btnDog.setOnClickListener(btnLinear);
        btnCat.setOnClickListener(btnLinear);
        btnHorse.setOnClickListener(btnLinear);
    }
    View.OnClickListener btnLinear = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            linearDog.setVisibility(View.INVISIBLE);
            linearCat.setVisibility(View.INVISIBLE);
            linearhorse.setVisibility(View.INVISIBLE);
            switch (v.getId()){
                case R.id.btn_dog:
                    linearDog.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_cat:
                    linearCat.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_horse:
                    linearhorse.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}