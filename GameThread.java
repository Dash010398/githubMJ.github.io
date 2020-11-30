package com.example.myapplication.android.app.android.app.android.app.android.app.android.app;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;

import androidx.appcompat.app.AppCompatActivity;

import java.util.jar.JarEntry;

public class GameThread extends Thread{

    SurfaceHolder surfaceHolder;
    boolean isRunning;
    long starTime, loopTime;
    long DELAY = 33;

    public GameThread(SurfaceHolder surfaceHolder){
        this.surfaceHolder = surfaceHolder;
        isRunning = true;
    }

    @Override
    public void run() {

        while(isRunning){
            starTime = SystemClock.uptimeMillis();

            Canvas canvas = surfaceHolder.lockCanvas(null);
            if(canvas !=null){
                synchronized (surfaceHolder){
                    Appconstants.getGameEngine().updateAnDrawBackgroundImage(canvas);

                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }

            loopTime = SystemClock.uptimeMillis()- starTime;

            if (loopTime < DELAY ){
                try{
                    Thread.sleep(DELAY - loopTime);
                }catch(InterruptedException e){
                    Log.e("Interrupted","Interrupted while sleeping");
                }
            }
        }
    }

    public boolean isRunning(){
           return isRunning;
    }

    public void setIsRunning (boolean state){
        isRunning = state;
    }
}
