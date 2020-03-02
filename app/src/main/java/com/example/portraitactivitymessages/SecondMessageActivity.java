package com.example.portraitactivitymessages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SecondMessageActivity extends AppCompatActivity {


    public static final String EXTRAMESSAGE2="com.example.portraitactivitymessages.extra.MESSAGE";
    private EditText returnMessage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_message);
        returnMessage2= findViewById(R.id.messageToSend2);

        ImageView imageView = findViewById(R.id.imageView2);
        Glide.with(this).load("https://images-na.ssl-images-amazon.com/images/I/71nfdYd8iqL._AC_SX425_.jpg").into(imageView);



        Intent intent =getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRAMESSAGE);
        TextView textview = findViewById(R.id.messageView2);
        textview.setText(message);

    }

    public void backToFirst(View view){

        String message = returnMessage2.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRAMESSAGE2, message);

        startActivity(intent);
    }


}
