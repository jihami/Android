package kr.hs.emirim.w2027.project_10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        Button btnOpen = findViewById(R.id.btn_open);
        btnOpen.setOnClickListener(btnOpenListener);

    }
    View.OnClickListener btnOpenListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (radioGroup.getCheckedRadioButtonId()){
                case R.id.radio_second:
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                case R.id.radio_third:
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);
            }
            startActivity(intent);
        }
    };
}