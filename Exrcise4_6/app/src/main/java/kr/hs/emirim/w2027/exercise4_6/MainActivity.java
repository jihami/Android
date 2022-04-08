package kr.hs.emirim.w2027.exercise4_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox checkEnabled, checkClickable, checkRotation;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_7);
        checkEnabled = findViewById(R.id.check_enabled);
        checkClickable = findViewById(R.id.check_clickable);
        checkRotation = findViewById(R.id.check_rotation);

        btn = findViewById(R.id.btn);
        checkEnabled.setOnCheckedChangeListener(checkListner);
        checkClickable.setOnCheckedChangeListener(checkListner);
        checkRotation.setOnCheckedChangeListener(checkListner);
    }
    CompoundButton.OnCheckedChangeListener checkListner = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton v, boolean isChecked) {
            switch (v.getId()){
                case R.id.check_enabled:
                    if (isChecked)
                        btn.setEnabled(true);
                    else
                        btn.setEnabled(false);
                    break;
                case R.id.check_clickable:
                    if (isChecked)
                        btn.setClickable(true);
                    else
                        btn.setClickable(false);
                    break;
                case R.id.check_rotation:
                    if (isChecked)
                        btn.setRotation(45);
                    else
                        btn.setRotation(0);
                    break;
            }
        }
    };
}