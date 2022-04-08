package kr.hs.emirim.w2027.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
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
//                Toast.makeText(getApplicationContext(),"ToDo page",Toast.LENGTH_SHORT).show();
                Toast_Nomal("ToDO page");
                Intent intent = new Intent(getApplicationContext(), ToDo_1.class);
                startActivity(intent);
            }
        });
        btn_timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast toast = Toast.makeText(getApplicationContext(),"Timer page",Toast.LENGTH_SHORT);
//                toast.show();
                Toast_Nomal("Timer page");
                Intent intent = new Intent(getApplicationContext(), Timer_2.class);
                startActivity(intent);
            }
        });
        btn_stopwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"StopWatch page",Toast.LENGTH_SHORT).show();
                Toast_Nomal("StopWatch page");
                Intent intent = new Intent(getApplicationContext(), StopWatch_3.class);
                startActivity(intent);
            }
        });
        btn_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"note page",Toast.LENGTH_SHORT).show();
                Toast_Nomal("Note page");
                Intent intent = new Intent(getApplicationContext(), Note_4.class);
                startActivity(intent);
            }
        });
    }
    public void Toast_Nomal(String message){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup)findViewById(R.id.toast_layout));
        TextView toast_textview  = layout.findViewById(R.id.toast_textview);
        toast_textview.setText(String.valueOf(message));
        Toast toast = new Toast(getApplicationContext());
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0); //TODO 메시지가 표시되는 위치지정 (가운데 표시)
        //toast.setGravity(Gravity.TOP, 0, 0); //TODO 메시지가 표시되는 위치지정 (상단 표시)
        //toast.setGravity(Gravity.BOTTOM, 0, 0); //TODO 메시지가 표시되는 위치지정 (하단 표시)
        toast.setDuration(Toast.LENGTH_SHORT); //메시지 표시 시간
        toast.setView(layout);
        toast.show();
//        https://kkh0977.tistory.com/284
    }
}
