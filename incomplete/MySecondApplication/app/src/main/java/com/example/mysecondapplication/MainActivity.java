package com.example.mysecondapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);


    }

    public void sendMessage(View view) {

        Intent intent = new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("MESSAGE_ID", "message id information");
        startActivity(intent);
    }
}
