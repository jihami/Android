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
        btn_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"ToDo페이지 입니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Second.class);
                startActivity(intent);
            }
        });
    }
}