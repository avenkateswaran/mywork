package com.capgemini.utm.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public static String getFormattedTime(){
        Date myDate = new Date();
        String formattedDate = new SimpleDateFormat("yyyy-MM-dd-HHmm").format(myDate);
        return formattedDate;
    }
}
