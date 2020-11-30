package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.textclassifier.ConversationActions;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.android.app.android.app.android.app.android.app.android.app.AppConstants;
import com.example.myapplication.android.app.android.app.android.app.android.app.android.app.GameEngine;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        AppConstants.initialization(this.getApplicationContext());
    }
    public void startGame(View view) {
        //Log.i("Imagebutton","clicked");
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
        finish();
    }

    }

