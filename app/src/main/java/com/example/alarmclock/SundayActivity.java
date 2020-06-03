package com.example.alarmclock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SundayActivity extends Activity implements OnClickListener {
    Button btnSetAlarm21;
    Button btnSetAlarm22;
    Button btnSetAlarm23;
    Button btnSetAlarm24;
    Button btnSetAlarm25;
    Button btnSetAlarm26;
    Button btnSetAlarm27;
    Button btnSetAlarm28;
    Button btnSetAlarm29;
    Button btnSetAlarm30;
    Button btnSetAlarm31;
    Button btnSetAlarm32;
    Button btnSetAlarm33;
    Button btnSetAlarm34;
    Button btnSetAlarm35;
    Button btnSetAlarm36;
    Button btnSetAlarm37;
    Button btnSetAlarm38;
    Button btnSetAlarm39;
    Button btnSetAlarm40;
    Button btnSetAlarm41;
    Button btnSetAlarm42;
    Button btnSetAlarm43;
    Button btnSetAlarm44;
    Button btnSetAlarm45;
    Button btnSetAlarm46;
    Button btnSetAlarm47;
    Button btnSetAlarm48;
    Button btnSetAlarm49;
    Button btnSetAlarm50;
    Button btnSetAlarm51;
    Button btnSetAlarm52;
    Button btnSetAlarm53;
    Button btnSetWeekday;
    Button btnSetSaturday;







    int minute, hour;
    Calendar cal;

    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat sdfNow = new SimpleDateFormat("HH:mm");
    String formatData = sdfNow.format(date);
    TextView TextView_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunday);
        //Intent intent = new Intent(this.getIntent());


        btnSetAlarm21 = (Button) findViewById(R.id.Button_21);
        btnSetAlarm22 = (Button) findViewById(R.id.Button_22);
        btnSetAlarm23 = (Button) findViewById(R.id.Button_23);
        btnSetAlarm24 = (Button) findViewById(R.id.Button_24);
        btnSetAlarm25 = (Button) findViewById(R.id.Button_25);
        btnSetAlarm26 = (Button) findViewById(R.id.Button_26);
        btnSetAlarm27 = (Button) findViewById(R.id.Button_27);
        btnSetAlarm28 = (Button) findViewById(R.id.Button_28);
        btnSetAlarm29 = (Button) findViewById(R.id.Button_29);
        btnSetAlarm30 = (Button) findViewById(R.id.Button_30);
        btnSetAlarm31 = (Button) findViewById(R.id.Button_31);
        btnSetAlarm32 = (Button) findViewById(R.id.Button_32);
        btnSetAlarm33 = (Button) findViewById(R.id.Button_33);
        btnSetAlarm34 = (Button) findViewById(R.id.Button_34);
        btnSetAlarm35 = (Button) findViewById(R.id.Button_35);
        btnSetAlarm36 = (Button) findViewById(R.id.Button_36);
        btnSetAlarm37 = (Button) findViewById(R.id.Button_37);
        btnSetAlarm38 = (Button) findViewById(R.id.Button_38);
        btnSetAlarm39 = (Button) findViewById(R.id.Button_39);
        btnSetAlarm40 = (Button) findViewById(R.id.Button_40);
        btnSetAlarm41 = (Button) findViewById(R.id.Button_41);
        btnSetAlarm42 = (Button) findViewById(R.id.Button_42);
        btnSetAlarm43 = (Button) findViewById(R.id.Button_43);
        btnSetAlarm44 = (Button) findViewById(R.id.Button_44);
        btnSetAlarm45 = (Button) findViewById(R.id.Button_45);
        btnSetAlarm46 = (Button) findViewById(R.id.Button_46);
        btnSetAlarm47 = (Button) findViewById(R.id.Button_47);
        btnSetAlarm48 = (Button) findViewById(R.id.Button_48);
        btnSetAlarm49 = (Button) findViewById(R.id.Button_49);
        btnSetAlarm50 = (Button) findViewById(R.id.Button_50);
        btnSetAlarm51 = (Button) findViewById(R.id.Button_51);
        btnSetAlarm52 = (Button) findViewById(R.id.Button_52);
        btnSetAlarm53 = (Button) findViewById(R.id.Button_53);

        btnSetSaturday = (Button) findViewById(R.id.btn_saturday);
        btnSetWeekday = (Button) findViewById(R.id.btn_weekday);


        btnSetAlarm21.setOnClickListener(this);
        btnSetAlarm22.setOnClickListener(this);
        btnSetAlarm23.setOnClickListener(this);
        btnSetAlarm24.setOnClickListener(this);
        btnSetAlarm25.setOnClickListener(this);
        btnSetAlarm26.setOnClickListener(this);
        btnSetAlarm27.setOnClickListener(this);
        btnSetAlarm28.setOnClickListener(this);
        btnSetAlarm29.setOnClickListener(this);
        btnSetAlarm30.setOnClickListener(this);
        btnSetAlarm31.setOnClickListener(this);
        btnSetAlarm32.setOnClickListener(this);
        btnSetAlarm33.setOnClickListener(this);
        btnSetAlarm34.setOnClickListener(this);
        btnSetAlarm35.setOnClickListener(this);
        btnSetAlarm36.setOnClickListener(this);
        btnSetAlarm37.setOnClickListener(this);
        btnSetAlarm38.setOnClickListener(this);
        btnSetAlarm39.setOnClickListener(this);
        btnSetAlarm40.setOnClickListener(this);
        btnSetAlarm41.setOnClickListener(this);
        btnSetAlarm42.setOnClickListener(this);
        btnSetAlarm43.setOnClickListener(this);
        btnSetAlarm44.setOnClickListener(this);
        btnSetAlarm45.setOnClickListener(this);
        btnSetAlarm46.setOnClickListener(this);
        btnSetAlarm47.setOnClickListener(this);
        btnSetAlarm48.setOnClickListener(this);
        btnSetAlarm49.setOnClickListener(this);
        btnSetAlarm50.setOnClickListener(this);
        btnSetAlarm51.setOnClickListener(this);
        btnSetAlarm52.setOnClickListener(this);
        btnSetAlarm53.setOnClickListener(this);

        btnSetWeekday.setOnClickListener(this);
        btnSetSaturday.setOnClickListener(this);





        TextView_now =(TextView) findViewById(R.id.textView_now);
        TextView_now.setText(formatData);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Button_21:
                set21dia();
                break;

            case R.id.Button_22:
                set22dia();
                break;

            case R.id.Button_23:
                set23dia();
                break;

            case R.id.Button_24:
                set24dia();
                break;

            case R.id.Button_25:
                set25dia();
                break;

            case R.id.Button_26:
                set26dia();
                break;

            case R.id.Button_27:
                set27dia();
                break;

            case R.id.Button_28:
                set28dia();
                break;

            case R.id.Button_29:
                set29dia();
                break;

            case R.id.Button_30:
                set30dia();
                break;

            case R.id.Button_31:
                set31dia();
                break;

            case R.id.Button_32:
                set32dia();
                break;

            case R.id.Button_33:
                set33dia();
                break;

            case R.id.Button_34:
                set34dia();
                break;

            case R.id.Button_35:
                set35dia();
                break;

            case R.id.Button_36:
                set36dia();
                break;

            case R.id.Button_37:
                set37dia();
                break;

            case R.id.Button_38:
                set38dia();
                break;

            case R.id.Button_39:
                set39dia();
                break;

            case R.id.Button_40:
                set40dia();
                break;

            case R.id.Button_41:
                set41dia();
                break;

            case R.id.Button_42:
                set42dia();
                break;

            case R.id.Button_43:
                set43dia();
                break;

            case R.id.Button_44:
                set44dia();
                break;

            case R.id.Button_45:
                set45dia();
                break;

            case R.id.Button_46:
                set46dia();
                break;

            case R.id.Button_47:
                set47dia();
                break;

            case R.id.Button_48:
                set48dia();
                break;

            case R.id.Button_49:
                set49dia();
                break;

            case R.id.Button_50:
                set50dia();
                break;

            case R.id.Button_51:
                set51dia();
                break;

            case R.id.Button_52:
                set52dia();
                break;

            case R.id.Button_53:
                set53dia();
                break;



            case R.id.btn_weekday:
                setWeekday();
                break;

            case R.id.btn_saturday:
                setSaturday();
                break;


        }
    }

    private void set21dia() {


        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 7);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 27);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 21Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 9);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 35);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 21Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 10);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 38);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 21Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent l = new Intent(AlarmClock.ACTION_SET_ALARM);
        l.putExtra(AlarmClock.EXTRA_HOUR, 12);
        l.putExtra(AlarmClock.EXTRA_MINUTES, 22);
        l.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        l.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 21Dia 네번째 사업");
        l.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(l);

    }

    private void set22dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 7);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 34);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 22Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 12);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 42);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 22Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set23dia() {


        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 7);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 41);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 23Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 9);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 28);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 23Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 12);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 49);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 23Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

    }

    private void set24dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 7);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 55);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 24Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 9);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 56);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 24Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 12);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 30);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 24Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent l = new Intent(AlarmClock.ACTION_SET_ALARM);
        l.putExtra(AlarmClock.EXTRA_HOUR, 14);
        l.putExtra(AlarmClock.EXTRA_MINUTES, 53);
        l.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        l.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 24Dia 네번째 사업");
        l.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(l);

    }

    private void set25dia() {


        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 8);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 2);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 25Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 13);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 10);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 25Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set26dia() {


        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 8);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 16);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 26Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 10);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 17);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 26Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 11);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 27);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 26Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent l = new Intent(AlarmClock.ACTION_SET_ALARM);
        l.putExtra(AlarmClock.EXTRA_HOUR, 12);
        l.putExtra(AlarmClock.EXTRA_MINUTES, 58);
        l.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        l.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 26Dia 네번째 사업");
        l.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(l);

    }

    private void set27dia() {


        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 8);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 23);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 27Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 11);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 38);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 27Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 14);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 43);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 27Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

    }

    private void set28dia() {


        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 8);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 30);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 28Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 14);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 20);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 28Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set29dia() {


        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 8);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 51);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 29Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 14);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 34);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 29Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 15);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 46);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 29Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

    }

    private void set30dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 9);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 3);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 30Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 12);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 2);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 30Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 14);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 36);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 30Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent l = new Intent(AlarmClock.ACTION_SET_ALARM);
        l.putExtra(AlarmClock.EXTRA_HOUR, 17);
        l.putExtra(AlarmClock.EXTRA_MINUTES, 5);
        l.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        l.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 30Dia 네번째 사업");
        l.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(l);

    }

    private void set31dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 9);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 10);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 31Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 11);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 0);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 31Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 13);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 1);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 31Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent l = new Intent(AlarmClock.ACTION_SET_ALARM);
        l.putExtra(AlarmClock.EXTRA_HOUR, 15);
        l.putExtra(AlarmClock.EXTRA_MINUTES, 21);
        l.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        l.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 31Dia 네번째 사업");
        l.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(l);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent m = new Intent(AlarmClock.ACTION_SET_ALARM);
        m.putExtra(AlarmClock.EXTRA_HOUR, 15);
        m.putExtra(AlarmClock.EXTRA_MINUTES, 10);
        m.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        m.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 31Dia 다섯번째 사업");
        m.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(m);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent n = new Intent(AlarmClock.ACTION_SET_ALARM);
        n.putExtra(AlarmClock.EXTRA_HOUR, 16);
        n.putExtra(AlarmClock.EXTRA_MINUTES, 52);
        n.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        n.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 31Dia 여섯번째 사업");
        n.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(n);
    }

    private void set32dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 9);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 17);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 32Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 14);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 22);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 32Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 16);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 59);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 32Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);


    }

    private void set33dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 9);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 12);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 33Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 14);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 55);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 33Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set34dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 9);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 26);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 34Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 15);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 2);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 34Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set35dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 9);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 31);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 35Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 12);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 44);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 35Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 15);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 49);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 35Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent l = new Intent(AlarmClock.ACTION_SET_ALARM);
        l.putExtra(AlarmClock.EXTRA_HOUR, 61);
        l.putExtra(AlarmClock.EXTRA_MINUTES, 38);
        l.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        l.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 35Dia 네번째 사업");
        l.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(l);

    }

    private void set36dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 9);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 45);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 36Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 13);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 26);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 36Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 14);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 43);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 36Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent l = new Intent(AlarmClock.ACTION_SET_ALARM);
        l.putExtra(AlarmClock.EXTRA_HOUR, 15);
        l.putExtra(AlarmClock.EXTRA_MINUTES, 7);
        l.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        l.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 36Dia 네번째 사업");
        l.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(l);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent m = new Intent(AlarmClock.ACTION_SET_ALARM);
        m.putExtra(AlarmClock.EXTRA_HOUR, 16);
        m.putExtra(AlarmClock.EXTRA_MINUTES, 27);
        m.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        m.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 36Dia 다섯번째 사업");
        m.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(m);

    }

    private void set37dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 9);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 54);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 37Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 15);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 9);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 37Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set38dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 10);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 22);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 38Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 15);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 16);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 38Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set39dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 9);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 53);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 39Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 15);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 59);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 39Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set40dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 10);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 50);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 40Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 15);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 21);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 40Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set41dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 10);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 57);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 41Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 16);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 29);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 41Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);


    }

    private void set42dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 11);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 11);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 42Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 16);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 35);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 42Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set43dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 11);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 18);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 43Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 16);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 42);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 43Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set44dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 11);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 30);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 44Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 14);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 50);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 44Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 15);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 46);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 44Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent l = new Intent(AlarmClock.ACTION_SET_ALARM);
        l.putExtra(AlarmClock.EXTRA_HOUR, 16);
        l.putExtra(AlarmClock.EXTRA_MINUTES, 45);
        l.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        l.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 44Dia 네번째 사업");
        l.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(l);

    }

    private void set45dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 11);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 32);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 45Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 13);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 12);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 45Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 16);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 49);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 45Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

    }

    private void set46dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 12);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 26);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 46Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 15);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 32);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 46Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 17);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 3);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 46Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

    }

    private void set47dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 11);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 53);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 47Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 15);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 53);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 47Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 19);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 9);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 47Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

    }

    private void set48dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 12);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 21);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 48Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 16);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 56);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 48Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set49dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 12);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 35);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 49Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 17);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 17);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 49Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

    }

    private void set50dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 13);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 29);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 50Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 15);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 32);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 50Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 17);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 24);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 50Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

    }

    private void set51dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 13);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 3);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 51Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 16);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 23);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 51Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 19);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 17);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 51Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

    }

    private void set52dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 13);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 31);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 52Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 17);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 35);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 52Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 19);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 25);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 52Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

    }

    private void set53dia() {

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_HOUR, 14);
        i.putExtra(AlarmClock.EXTRA_MINUTES, 27);
        i.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        i.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 53Dia 첫번째 사업");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent j = new Intent(AlarmClock.ACTION_SET_ALARM);
        j.putExtra(AlarmClock.EXTRA_HOUR, 17);
        j.putExtra(AlarmClock.EXTRA_MINUTES, 47);
        j.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        j.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 53Dia 두번째 사업");
        j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(j);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent k = new Intent(AlarmClock.ACTION_SET_ALARM);
        k.putExtra(AlarmClock.EXTRA_HOUR, 19);
        k.putExtra(AlarmClock.EXTRA_MINUTES, 41);
        k.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        k.putExtra(AlarmClock.EXTRA_MESSAGE, "휴일 53Dia 세번째 사업");
        k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(k);

    }

    private void setWeekday() {
        Intent intentSat = new Intent(SundayActivity.this, MainActivity.class);
        startActivity(intentSat);
    }

    private void setSaturday() {
        Intent intentSat = new Intent(SundayActivity.this, SaturdayActivity.class);
        startActivity(intentSat);
    }



}