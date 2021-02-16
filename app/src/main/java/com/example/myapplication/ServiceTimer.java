package com.example.myapplication;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Button;
import androidx.annotation.Nullable;
import java.util.Timer;
import java.util.TimerTask;


public class ServiceTimer extends Service {
    Timer timer=new Timer();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw  new UnsupportedOperationException("Not extended");

    }

    @Override
    public void onCreate() {
      timer=new Timer();

    }

    @Override
    public int onStartCommand(final Intent intent, int flags, int startId) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                intent.put
            }
        },1000);
    }

    @Override
    public void onDestroy() {
        timer.cancel();
    }
}
