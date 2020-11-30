package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.myapplication.android.app.android.app.android.app.android.app.android.app.GameView;

public class GameActivity extends Activity {

    GameView gameView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new GameView(this);
        setContentView(gameView);
    }
}

