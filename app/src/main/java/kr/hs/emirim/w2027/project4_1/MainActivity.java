package kr.hs.emirim.w2027.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlus = findViewById(R.id.bnt1);
        Button btnMinus = findViewById(R.id.bnt2);
        Button btnMulti = findViewById(R.id.bnt3);
        Button btnDiv = findViewById(R.id.bnt4);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        textResult = findViewById(R.id.t1);
//        btnPlus.setOnTouchListener(btnListener);
//        btnMinus.setOnTouchListener(btnListener);
//        btnMinus.setOnTouchListener(btnListener);
//        btnDiv.setOnTouchListener(btnListener);
    }
}