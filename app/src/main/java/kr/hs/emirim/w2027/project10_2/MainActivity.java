package kr.hs.emirim.w2027.project10_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.function.ToDoubleBiFunction;
//Change ViewFlipper

public class MainActivity extends AppCompatActivity {
    String[] imgNames = {"사진1", "사진2", "사진3", "사진4", "사진5", "사진6", "사진7", "사진8", "사진9"};
    int[] imgVIds = {R.id.img01, R.id.img02, R.id.img03, R.id.img04, R.id.img05, R.id.img06, R.id.img07, R.id.img08, R.id.img09};
    int[] voteCount = new int[imgVIds.length];
    ImageView[] image = new ImageView[imgVIds.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.title);
        setContentView(R.layout.activity_main);

        for(int i=0; i<imgNames.length; i++){
            final int index;
            index = i;
            image[index] = findViewById(imgVIds[index]);
            image[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    voteCount[index]++;
                    Log.v("*** 129", imgNames[index]+"총"+voteCount[index]+"표" );
                    Toast.makeText(getApplicationContext(), imgNames[index]+"총"+voteCount[index]+"표", Toast.LENGTH_SHORT).show();
                }
            });
        }
        Button btnFinsh = findViewById(R.id.btn_done);
        btnFinsh.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), ResultActivity2.class);
            intent.putExtra("voteCount", voteCount);
            intent.putExtra("imgNames",imgNames);
            startActivity(intent);
        }
    };
}