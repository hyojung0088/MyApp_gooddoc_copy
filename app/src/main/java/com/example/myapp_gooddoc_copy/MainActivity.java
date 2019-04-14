package com.example.myapp_gooddoc_copy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button serachBtn;
    EditText SerachText;
    TextView lbUserId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SerachText = findViewById(R.id.SerachText);
        serachBtn = findViewById(R.id.serachBtn);
        lbUserId = findViewById(R.id.lbUserId);

        serachBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strText = SerachText.getText().toString();
                Toast.makeText(MainActivity.this, strText, Toast.LENGTH_LONG).show();
                String toastText = String.format("[%s]을 검색합니다.", strText);
                Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_LONG).show();
            }
        });

        String loginUserId = getIntent().getStringExtra("user_id");
        String welcomeMsg = String.format("[%s]님 환영합니다.", loginUserId);
        lbUserId.setText(welcomeMsg);
    }
}
