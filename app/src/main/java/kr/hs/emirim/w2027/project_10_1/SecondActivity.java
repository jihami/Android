package kr.hs.emirim.w2027.project_10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button secondClose = findViewById(R.id.second_close);
        secondClose.setOnClickListener(btnCloseListener);
    }

    View.OnClickListener btnCloseListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}