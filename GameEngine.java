package com.example.myapplication.android.app.android.app.android.app.android.app.android.app;

import android.graphics.Canvas;

import androidx.appcompat.app.AppCompatActivity;

public class GameEngine {

    BackgroundImage backgroundImage;

    public GameEngine() {
        backgroundImage = new BackgroundImage();
    }

    public void updateAndDrawBackgroundImage(Canvas canvas) {
        BackgroundImage.setX(backgroundImage.getX() - backgroundImage.getVelocity());
        if (backgroundImage.getX() < -AppConstants.getBitmapBank().getBackgroundWidth()) {
            backgroundImage.setX(0);
        }
        canvas.drawBitmap(AppConstants.getBitmapBank().getBackground(), backgroundImage.getX(), backgroundImage.getY(), null);
        if (backgroundImage.getX() < -(AppConstants.getBitmapBank().getBackgroundWidth() - AppConstants.SCREEN_WIDTH)) {
            canvas.drawBitmap(AppConstants.getBitmapBank().getBackground(),backgroundImage.getX() +
                    AppConstants.getBitmapBank().getBackgroundWidth(),backgroundImage.getY(),null);
        }
    }
}

