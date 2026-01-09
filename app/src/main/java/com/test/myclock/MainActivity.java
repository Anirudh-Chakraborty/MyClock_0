package com.test.myclock;

import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    TimePicker alarmTime;
    TextClock currentTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        alarmTime = findViewById(R.id.timePicker);
        currentTime = findViewById(R.id.textClock);

        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(currentTime.getText().toString().equals(AlarmTime())){

                }
            }
        },0,1000);
    }


    public String AlarmTime(){

        Integer alarmHours = alarmTime.getHour();
        Integer alarmMinutes = alarmTime.getMinute();

        return "helo";
    }
}