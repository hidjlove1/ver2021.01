package com.example.alarmclock;

import java.util.Calendar;
import java.util.GregorianCalendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
    Button btnSetAlarm21;
    Button btnSetAlarm22;
 //   EditText etHour, etMinute;
    int minute, hour;
    Calendar cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSetAlarm21 = (Button) findViewById(R.id.Button_21);
        btnSetAlarm22 = (Button) findViewById(R.id.Button_22);
      //  etHour = (EditText) findViewById(R.id.etHour);
       // etMinute = (EditText) findViewById(R.id.etMinute);
        btnSetAlarm21.setOnClickListener(this);
        btnSetAlarm22.setOnClickListener(this);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_activity, menu);
//        return true;
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Button_21:
                set21dia();
                break;


            case R.id.Button_22:
                set22dia();
                break;

        }
    }

    private void set21dia() {
//        cal = new GregorianCalendar();
//        cal.setTimeInMillis(System.currentTimeMillis());
//        day = cal.get(Calendar.DAY_OF_WEEK);
//        hour = cal.get(Calendar.HOUR_OF_DAY);
//        minute = cal.get(Calendar.MINUTE);

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 6);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 26);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        startActivity(i);

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 9);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 48);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        startActivity(j);

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 11);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 9);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        startActivity(k);
    }

    private void set22dia() {
//        cal = new GregorianCalendar();
//        cal.setTimeInMillis(System.currentTimeMillis());
//        day = cal.get(Calendar.DAY_OF_WEEK);
//        hour = cal.get(Calendar.HOUR_OF_DAY);
//        minute = cal.get(Calendar.MINUTE);

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 6);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 58);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        startActivity(i);

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 9);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 15);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        startActivity(j);

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 12);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 57);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        startActivity(k);

        Intent l = new Intent(AlarmClock.ACTION_SET_ALARM);
        l.putExtra(AlarmClock.EXTRA_HOUR, 13);
        l.putExtra(AlarmClock.EXTRA_MINUTES, 39);
        l.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        startActivity(l);

        Intent m = new Intent(AlarmClock.ACTION_SET_ALARM);
        m.putExtra(AlarmClock.EXTRA_HOUR, 14);
        m.putExtra(AlarmClock.EXTRA_MINUTES, 21);
        m.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        startActivity(m);
    }


}