package kr.hs.emirim.w2027.ex11_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] arr = {"Black Widow","Quiet Place 2","Edge Of Tomorrow","Walking Dead","기묘한 이야기","크루엘라","Boss Baby 2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list1 = findViewById(R.id.list1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,arr);
        list1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),arr[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}