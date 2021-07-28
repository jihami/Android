package kr.hs.emirim.w2027.studymanager;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Second extends AppCompatActivity {
    ArrayList<String> arrList;
    ArrayAdapter<String> adapter;
    EditText editItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editItem = findViewById(R.id.edit_item);
        arrList = new ArrayList<String>();
        ListView list1 = findViewById(R.id.list1);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrList);
        list1.setAdapter(adapter);
        Button btnAdd = findViewById(R.id.btn_add);
        Button btnDel = findViewById(R.id.btn_del);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrList.add(editItem.getText().toString());
                adapter.notifyDataSetChanged();
                editItem.setText("");
            }
        });
    }
}