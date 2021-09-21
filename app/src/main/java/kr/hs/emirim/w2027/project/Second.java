package kr.hs.emirim.w2027.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Fragment mainFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mainFragment = new MainFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();
        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                saveToDo();

                Toast.makeText(getApplicationContext(),"추가되었습니다.",Toast.LENGTH_SHORT).show();

            }
        });
    }
    private void saveToDo(){

    }
}