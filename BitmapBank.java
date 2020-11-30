package com.example.myapplication.android.app.android.app.android.app.android.app.android.app;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.myapplication.R;

public class BitmapBank {

    Bitmap background;

    public BitmapBank(Resources res) {

        background = BitmapFactory.decodeResource(res, R.drawable.background);
        background = scaleImage(background);

    }

    //Return background bitmap
    public Bitmap getBackground(){
        return background;
    }

    //Return background width
    public int getBackgroundWidth(){
        return background.getWidth();
    }

    //Return background height
    public int getBackgroundHeight(){
        return background.getHeight();
    }

    public Bitmap scaleImage(Bitmap bitmap)
        float widthHeightRadio = getBackgroundWidth()/getBackgroundHeight();
        int backgroundScaleWidth = (int) widthHeightRadio * AppConstants.SCREEN_HEIGHT;


}

