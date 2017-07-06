package com.ak.utils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;

/**
 * Created by amolina on 29/05/17.
 */
public class CountersUtils {
    public static BigDecimal randomIdGenerator(){
    	DateFormat df = new SimpleDateFormat("yyMMddHHmm"); // Just the year, with 2 digits
    	String formattedDate = df.format(Calendar.getInstance().getTime());
    	return new BigDecimal(formattedDate);
    }
}