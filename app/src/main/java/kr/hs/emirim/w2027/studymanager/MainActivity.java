package kr.hs.emirim.w2027.studymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnL = findViewById(R.id.btn_left);
        ImageButton btnR = findViewById(R.id.btn_right);
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"이전페이지 입니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Fourth.class);
                startActivity(intent);
            }
        });
//        Intent intent = new Intent(this, Second.class);
//        startActivity(intent);
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"다음페이지 입니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Second.class);
                startActivity(intent);
            }
        });


    }
}