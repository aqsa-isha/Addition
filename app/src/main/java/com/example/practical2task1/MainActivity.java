package com.example.practical2task1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Addition of Numbers");
        Button btn = findViewById(R.id.Add_btn);
        TextView output = findViewById(R.id.Output_View);
        EditText val1 = findViewById(R.id.input_Value1), val2 = findViewById(R.id.input_Value2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(val1.getText().toString());
                Double b = Double.parseDouble(val2.getText().toString());
                Double ans = a + b;
                output.setText(ans.toString());
            }
        });
    }
}