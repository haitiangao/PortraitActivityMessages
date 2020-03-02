package com.example.portraitactivitymessages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRAMESSAGE="com.example.portraitactivitymessages.extra.MESSAGE";
    private EditText returnMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        returnMessage= findViewById(R.id.messageToSend);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Glide.with(this).load("https://www.stickpng.com/assets/images/58469c62cef1014c0b5e47f6.png").into(imageView);

        Intent intent =getIntent();
        String message = intent.getStringExtra(SecondMessageActivity.EXTRAMESSAGE2);
        TextView textview = findViewById(R.id.messageView);
        textview.setText(message);

    }

    public void launchSecondMessage(View view){
        String message = returnMessage.getText().toString();
        Intent intent = new Intent(this, SecondMessageActivity.class);
        intent.putExtra(EXTRAMESSAGE, message);

        startActivity(intent);
    }


}
