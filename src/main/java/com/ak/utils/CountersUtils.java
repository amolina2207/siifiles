package com.ak.utils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * Created by amolina on 29/05/17.
 */
public class CountersUtils {

    private static final Random generator = new Random();
    private static LocalDate date = LocalDate.now();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static int randomGenerator() {
        int result = generator.nextInt(99) + 1;
        return result;
    }

    public static BigDecimal randomIdGenerator(){
        return new BigDecimal(date.format(formatter)+String.valueOf(randomGenerator()));
    }
}