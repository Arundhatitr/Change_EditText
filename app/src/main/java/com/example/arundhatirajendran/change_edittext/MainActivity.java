package com.example.arundhatirajendran.change_edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Text;
    Button Change;
    String s=" ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text=(EditText) findViewById(R.id.Text);
        Change=(Button) findViewById(R.id.Change);

        Change.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                s=Text.getText().toString();
                Text.setText("Text Changed");
            }
        });
    }
}
