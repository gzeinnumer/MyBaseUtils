package com.gzeinnumer.mybaseutils;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.gzeinnumer.mybaseutils.utils.MyBaseUtilsDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String value ="Wed, 18 Apr 2012 07:55:29 +0000";

        String reformatMultiArray = MyBaseUtilsDate.reformatDate(value,
                new String[]{
                        MyBaseUtilsDate.F_DAY_NAME, ", ",
                        MyBaseUtilsDate.F_DATE, " ",
                        MyBaseUtilsDate.F_MONTH_NAME, " ",
                        MyBaseUtilsDate.F_YEAR, " ",
                        MyBaseUtilsDate.F_HOUR, ":",
                        MyBaseUtilsDate.F_MINUTES, ":",
                        MyBaseUtilsDate.F_SECOND, " ",
                        MyBaseUtilsDate.F_ZONE
                },
                new String[]{
                        MyBaseUtilsDate.F_MONTH_NAME, " ",
                        MyBaseUtilsDate.F_DATE, ",",
                        MyBaseUtilsDate.F_YEAR, " ",
                        MyBaseUtilsDate.F_HOUR, ":",
                        MyBaseUtilsDate.F_MINUTES, " ",
                        MyBaseUtilsDate.F_AM_PM,

                });
        Log.d(TAG, "onCreate:reformatMultiArray "+reformatMultiArray);

        String reformatOneString = MyBaseUtilsDate.reformatDate(value,"EEE, dd MMM yyyy hh:mm:ss Z","MMM dd,yyyy hh:mm a");
        Log.d(TAG, "onCreate: "+reformatOneString);
    }
}