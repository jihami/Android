package kr.hs.emirim.w2027.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_todo = findViewById(R.id.todo);
        Button btn_timer = findViewById(R.id.timer);
        Button btn_stopwatch = findViewById(R.id.stopWatch);
        Button btn_note = findViewById(R.id.note);
        btn_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Timer page",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), ToDo_1.class);
                startActivity(intent);
            }
        });
        btn_timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Timer page",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Timer_2.class);
                startActivity(intent);
            }
        });
        btn_stopwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"StopWatch page",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), StopWatch_3.class);
                startActivity(intent);
            }
        });
        btn_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"note page",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Note_4.class);
                startActivity(intent);
            }
        });
    }
}