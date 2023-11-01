package com.example.diplom;

import android.widget.TimePicker;

public class Alarm {
    private int hour;
    private int minute;
    private String dayOfWeek;

    public Alarm(int hour, int minute, String dayOfWeek) {
        this.hour = hour;
        this.minute = minute;
        this.dayOfWeek = dayOfWeek;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }
}
