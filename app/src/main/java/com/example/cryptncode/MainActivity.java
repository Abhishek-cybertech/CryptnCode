package com.example.cryptncode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button crpt, mor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link both the button variables with its id
        crpt = findViewById(R.id.cryp_btn);
        mor = findViewById(R.id.mrs_btn);

        // onClick function for encryption
        crpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent function to move to another activity
                Intent intent = new Intent(getApplicationContext(), crypto.class);
                startActivity(intent);
            }
        });

        // onClick function for decryption
        mor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent function to move to another activity
                Intent intent = new Intent(getApplicationContext(), Morse_code.class);
                startActivity(intent);
            }
        });
    }
}